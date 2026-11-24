package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class ym1 implements he8, wi3 {
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;

    public ym1(mu1 mu1Var, boolean z, k27 k27Var, int i) {
        this.c = mu1Var;
        this.a = z;
        this.d = k27Var;
        this.b = i;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void c(TLRPC.MessageMedia messageMedia) {
        int i;
        mu1 mu1Var = (mu1) this.c;
        k27 k27Var = (k27) this.d;
        if (this.a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = mu1Var.getMessagesController().h1(k27.B0(k27Var.k));
            tL_messages_appendTodoList.msg_id = k27Var.e1();
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
                TLRPC.MessageMedia messageMedia2 = k27Var.k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            k27Var.k.media = messageMedia;
            mu1Var.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = k27Var.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        k27Var.k.media = messageMedia;
        mu1Var.getSendMessagesHelper().s(k27Var, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = (String) this.d;
        String str2 = LaunchActivity.C1;
        long j = ((zc7) arrayList.get(0)).a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.a);
        if (cf3.B(j)) {
            bundle.putInt("enc_id", (int) (4294967295L & j));
        } else if (cf3.D(j)) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        int i3 = this.b;
        if (!na7.q1(i3).A(bundle, cj3Var, null, null)) {
            return true;
        }
        kk7.f(i3).k(kk7.s, new Object[0]);
        hq6.d0(i3).T1(j, 0L, str, null, null, null, null, 0L, false, false, null);
        ui5 N = launchActivity.N();
        ((ActionBarLayout) N).U(new mu1(bundle), true, false);
        return true;
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    public ym1(LaunchActivity launchActivity, boolean z, int i, String str) {
        this.c = launchActivity;
        this.a = z;
        this.b = i;
        this.d = str;
    }
}
