package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class de0 {
    public static void a(yv1 yv1Var, int i, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2, int i3) {
        tk5 parentLayout;
        if ((chat != null || user != null) && (parentLayout = yv1Var.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (ce0 ce0Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic == null) {
                    if (ce0Var.f == j) {
                        return;
                    }
                } else {
                    TLRPC.TL_forumTopic tL_forumTopic2 = ce0Var.e;
                    if (tL_forumTopic2 != null && tL_forumTopic2.id == tL_forumTopic.id) {
                        return;
                    }
                }
            }
            ?? obj = new Object();
            obj.a = yv1.class;
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

    public static defpackage.m8 b(org.telegram.ui.ActionBar.d r35, android.view.View r36, long r37, long r39, defpackage.ylb r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de0.b(org.telegram.ui.ActionBar.d, android.view.View, long, long, ylb):m8");
    }
}
