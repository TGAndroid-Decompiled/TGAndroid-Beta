package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class fd0 {
    public static void a(zu1 zu1Var, int i, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2, int i3) {
        wk5 parentLayout;
        if ((chat != null || user != null) && (parentLayout = zu1Var.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (ed0 ed0Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic == null) {
                    if (ed0Var.f == j) {
                        return;
                    }
                } else {
                    TLRPC.TL_forumTopic tL_forumTopic2 = ed0Var.e;
                    if (tL_forumTopic2 != null && tL_forumTopic2.id == tL_forumTopic.id) {
                        return;
                    }
                }
            }
            ?? obj = new Object();
            obj.a = zu1.class;
            obj.b = i;
            obj.f = j;
            obj.h = i3;
            obj.g = i2;
            obj.c = chat;
            obj.d = user;
            obj.e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static defpackage.n8 b(org.telegram.ui.ActionBar.e r35, android.view.View r36, long r37, long r39, defpackage.vnb r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd0.b(org.telegram.ui.ActionBar.e, android.view.View, long, long, vnb):n8");
    }
}
