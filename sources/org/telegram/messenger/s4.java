package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.lt0;
public final class s4 implements RequestDelegate {
    public final int f25416a;
    public final Object f25417b;
    public final Object f25418c;

    public s4(int i7, Object obj, Object obj2) {
        this.f25416a = i7;
        this.f25417b = obj;
        this.f25418c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        switch (this.f25416a) {
            case 0:
                g5 g5Var = (g5) this.f25417b;
                lt0 lt0Var = (lt0) this.f25418c;
                if (tL_error == null) {
                    g5Var.Z.clear();
                    g5Var.Y.clear();
                    g5Var.m0 = 0;
                    g5Var.f22600s = false;
                    g5Var.f22588e = false;
                    g5Var.h = false;
                    g5Var.f22583b = false;
                    g5Var.f22599r = false;
                    g5Var.f22601w = "";
                    g0.h3(new b4(28, g5Var, lt0Var));
                    return;
                }
                g0.h3(lt0Var);
                return;
            case 1:
                g5 g5Var2 = (g5) this.f25417b;
                TLRPC.User user = (TLRPC.User) this.f25418c;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.personal) {
                        for (int i7 = 0; i7 < updates.users.size(); i7++) {
                            if (updates.users.get(i7).f27102id == user.f27102id) {
                                updates.users.get(i7).photo = user.photo;
                            }
                        }
                    }
                    g5Var2.getMessagesController().O3(updates, false);
                    for (int i10 = 0; i10 < updates.users.size(); i10++) {
                        TLRPC.User user2 = updates.users.get(i10);
                        if (user2.f27102id == user.f27102id) {
                            Utilities.h.c(new b4(29, g5Var2, user2));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user2.f27102id;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(tL_contact);
                            g5Var2.getMessagesStorage().c1(arrayList, false);
                            if (!TextUtils.isEmpty(user2.phone)) {
                                g5.m(0, user2.first_name, user2.last_name);
                                g5Var2.getMessagesStorage().f(user2.phone, "");
                                d5 d5Var = (d5) g5Var2.Z.get(user2.phone);
                                if (d5Var != null && (indexOf = d5Var.f21968g.indexOf(user2.phone)) != -1) {
                                    d5Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    g0.h3(new ng(g5Var2, updates, user, 16));
                    return;
                }
                return;
            case 2:
                g5 g5Var3 = (g5) this.f25417b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.f25418c;
                if (tLObject instanceof Vector) {
                    g0.h3(new ng(g5Var3, editor, (Vector) tLObject, 14));
                    return;
                }
                return;
            case 3:
                ui uiVar = (ui) this.f25417b;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) this.f25418c;
                uiVar.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    uiVar.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    return;
                }
                return;
            case 4:
                g0.h3(new lg((ui) this.f25417b, tLObject, (TLRPC.Document) this.f25418c, 1));
                return;
            case 5:
                ui uiVar2 = (ui) this.f25417b;
                Runnable runnable = (Runnable) this.f25418c;
                uiVar2.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    uiVar2.v1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    uiVar2.v1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (runnable != null) {
                    g0.h3(runnable);
                    return;
                }
                return;
            case 6:
                g0.h3(new lg((qp) this.f25417b, tLObject, (ArrayList) this.f25418c, 7));
                return;
            case 7:
                qp qpVar = (qp) this.f25417b;
                Runnable runnable2 = (Runnable) this.f25418c;
                qpVar.getClass();
                if (tL_error == null) {
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    if (runnable2 != null) {
                        g0.h3(runnable2);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                g0.h3(new em((vv) this.f25417b, tLObject, (ArrayList) this.f25418c, tL_error, 22));
                return;
            case 9:
                gz gzVar = (gz) this.f25417b;
                Runnable runnable3 = (Runnable) this.f25418c;
                if (tLObject != null) {
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    if (runnable3 != null) {
                        g0.h3(runnable3);
                        return;
                    }
                    return;
                }
                gzVar.getClass();
                return;
            default:
                g0.i3(new q10((s10) this.f25417b, (String) this.f25418c, tL_error, tLObject, 0), 2L);
                return;
        }
    }
}
