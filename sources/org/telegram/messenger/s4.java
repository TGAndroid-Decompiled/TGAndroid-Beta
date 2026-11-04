package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ct0;
public final class s4 implements RequestDelegate {
    public final int f25273a;
    public final Object f25274b;
    public final Object f25275c;

    public s4(int i3, Object obj, Object obj2) {
        this.f25273a = i3;
        this.f25274b = obj;
        this.f25275c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        switch (this.f25273a) {
            case 0:
                g5 g5Var = (g5) this.f25274b;
                ct0 ct0Var = (ct0) this.f25275c;
                if (tL_error == null) {
                    g5Var.f22644a0.clear();
                    g5Var.Z.clear();
                    g5Var.f22661n0 = 0;
                    g5Var.f22663s = false;
                    g5Var.f22650e = false;
                    g5Var.h = false;
                    g5Var.f22645b = false;
                    g5Var.f22662r = false;
                    g5Var.f22664w = "";
                    g0.h3(new b4(28, g5Var, ct0Var));
                    return;
                }
                g0.h3(ct0Var);
                return;
            case 1:
                g5 g5Var2 = (g5) this.f25274b;
                TLRPC.User user = (TLRPC.User) this.f25275c;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.personal) {
                        for (int i3 = 0; i3 < updates.users.size(); i3++) {
                            if (updates.users.get(i3).f27150id == user.f27150id) {
                                updates.users.get(i3).photo = user.photo;
                            }
                        }
                    }
                    g5Var2.getMessagesController().O3(updates, false);
                    for (int i10 = 0; i10 < updates.users.size(); i10++) {
                        TLRPC.User user2 = updates.users.get(i10);
                        if (user2.f27150id == user.f27150id) {
                            Utilities.h.c(new b4(29, g5Var2, user2));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user2.f27150id;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(tL_contact);
                            g5Var2.getMessagesStorage().c1(arrayList, false);
                            if (!TextUtils.isEmpty(user2.phone)) {
                                g5.m(0, user2.first_name, user2.last_name);
                                g5Var2.getMessagesStorage().f(user2.phone, "");
                                d5 d5Var = (d5) g5Var2.f22644a0.get(user2.phone);
                                if (d5Var != null && (indexOf = d5Var.f22152g.indexOf(user2.phone)) != -1) {
                                    d5Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    g0.h3(new fg(g5Var2, updates, user, 16));
                    return;
                }
                return;
            case 2:
                g5 g5Var3 = (g5) this.f25274b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.f25275c;
                if (tLObject instanceof Vector) {
                    g0.h3(new fg(g5Var3, editor, (Vector) tLObject, 14));
                    return;
                }
                return;
            case 3:
                li liVar = (li) this.f25274b;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) this.f25275c;
                liVar.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    liVar.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    return;
                }
                return;
            case 4:
                g0.h3(new dg((li) this.f25274b, tLObject, (TLRPC.Document) this.f25275c, 1));
                return;
            case 5:
                li liVar2 = (li) this.f25274b;
                Runnable runnable = (Runnable) this.f25275c;
                liVar2.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    liVar2.v1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    liVar2.v1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (runnable != null) {
                    g0.h3(runnable);
                    return;
                }
                return;
            case 6:
                g0.h3(new dg((hp) this.f25274b, tLObject, (ArrayList) this.f25275c, 7));
                return;
            case 7:
                hp hpVar = (hp) this.f25274b;
                Runnable runnable2 = (Runnable) this.f25275c;
                hpVar.getClass();
                if (tL_error == null) {
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    if (runnable2 != null) {
                        g0.h3(runnable2);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                g0.h3(new ul((nv) this.f25274b, tLObject, (ArrayList) this.f25275c, tL_error, 22));
                return;
            case 9:
                yy yyVar = (yy) this.f25274b;
                Runnable runnable3 = (Runnable) this.f25275c;
                if (tLObject != null) {
                    yyVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    if (runnable3 != null) {
                        g0.h3(runnable3);
                        return;
                    }
                    return;
                }
                yyVar.getClass();
                return;
            default:
                g0.i3(new i10((k10) this.f25274b, (String) this.f25275c, tL_error, tLObject, 0), 2L);
                return;
        }
    }
}
