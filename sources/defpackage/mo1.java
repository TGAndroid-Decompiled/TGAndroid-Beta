package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class mo1 implements jg8, hk3 {
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;

    public mo1(yv1 yv1Var, boolean z, k47 k47Var, int i) {
        this.c = yv1Var;
        this.a = z;
        this.d = k47Var;
        this.b = i;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void c(TLRPC.MessageMedia messageMedia) {
        int i;
        yv1 yv1Var = (yv1) this.c;
        k47 k47Var = (k47) this.d;
        if (this.a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = yv1Var.getMessagesController().i1(k47.B0(k47Var.k));
            tL_messages_appendTodoList.msg_id = k47Var.e1();
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    i = this.b;
                    if (i2 >= i) {
                        break;
                    }
                    i3 = Math.max(i3, tL_messageMediaToDo.todo.list.get(i2).id);
                    i2++;
                }
                while (i < tL_messageMediaToDo.todo.list.size()) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i);
                    if (todoItem.id <= i3) {
                        todoItem.id = i3 + 1;
                    }
                    tL_messages_appendTodoList.list.add(todoItem);
                    i3 = Math.max(i3, todoItem.id);
                    i++;
                }
                TLRPC.MessageMedia messageMedia2 = k47Var.k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            k47Var.k.media = messageMedia;
            yv1Var.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = k47Var.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        k47Var.k.media = messageMedia;
        yv1Var.getSendMessagesHelper().s(k47Var, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = (String) this.d;
        String str2 = LaunchActivity.C1;
        long j = ((bf7) arrayList.get(0)).a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.a);
        if (pg3.B(j)) {
            bundle.putInt("enc_id", (int) (4294967295L & j));
        } else if (pg3.D(j)) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        int i3 = this.b;
        if (!oc7.r1(i3).A(bundle, nk3Var, null, null)) {
            return true;
        }
        nm7.f(i3).k(nm7.s, new Object[0]);
        hs6.d0(i3).T1(j, 0L, str, null, null, null, null, 0L, false, false, null);
        tk5 N = launchActivity.N();
        ((ActionBarLayout) N).U(new yv1(bundle), true, false);
        return true;
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    public mo1(LaunchActivity launchActivity, boolean z, int i, String str) {
        this.c = launchActivity;
        this.a = z;
        this.b = i;
        this.d = str;
    }
}
