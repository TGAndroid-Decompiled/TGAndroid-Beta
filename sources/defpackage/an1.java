package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class an1 implements vh8, oj3 {
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;

    public an1(zu1 zu1Var, boolean z, r47 r47Var, int i) {
        this.c = zu1Var;
        this.a = z;
        this.d = r47Var;
        this.b = i;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void a(TLRPC.MessageMedia messageMedia) {
        int i;
        zu1 zu1Var = (zu1) this.c;
        r47 r47Var = (r47) this.d;
        if (this.a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = zu1Var.getMessagesController().j1(r47.B0(r47Var.k));
            tL_messages_appendTodoList.msg_id = r47Var.e1();
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
                TLRPC.MessageMedia messageMedia2 = r47Var.k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            r47Var.k.media = messageMedia;
            zu1Var.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = r47Var.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        r47Var.k.media = messageMedia;
        zu1Var.getSendMessagesHelper().s(r47Var, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = (String) this.d;
        String str2 = LaunchActivity.C1;
        long j = ((jf7) arrayList.get(0)).a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.a);
        if (wf3.B(j)) {
            bundle.putInt("enc_id", (int) (4294967295L & j));
        } else if (wf3.D(j)) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        int i3 = this.b;
        if (!uc7.s1(i3).C(bundle, uj3Var, null, null)) {
            return true;
        }
        jn7.f(i3).k(jn7.s, new Object[0]);
        ls6.d0(i3).T1(j, 0L, str, null, null, null, null, 0L, false, false, null);
        wk5 N = launchActivity.N();
        ((ActionBarLayout) N).U(new zu1(bundle), true, false);
        return true;
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    public an1(LaunchActivity launchActivity, boolean z, int i, String str) {
        this.c = launchActivity;
        this.a = z;
        this.b = i;
        this.d = str;
    }
}
