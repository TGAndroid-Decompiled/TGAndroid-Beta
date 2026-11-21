package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.mt0;
public final class t4 implements RequestDelegate {
    public final int f26985a;
    public final Object f26986b;
    public final Object f26987c;

    public t4(int i7, Object obj, Object obj2) {
        this.f26985a = i7;
        this.f26986b = obj;
        this.f26987c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        switch (this.f26985a) {
            case 0:
                i5 i5Var = (i5) this.f26986b;
                mt0 mt0Var = (mt0) this.f26987c;
                if (tL_error == null) {
                    i5Var.f24586a0.clear();
                    i5Var.Z.clear();
                    i5Var.f24603n0 = 0;
                    i5Var.f24605s = false;
                    i5Var.f24592e = false;
                    i5Var.h = false;
                    i5Var.f24587b = false;
                    i5Var.f24604r = false;
                    i5Var.f24606w = "";
                    g0.g3(new w3(28, i5Var, mt0Var));
                    return;
                }
                g0.g3(mt0Var);
                return;
            case 1:
                i5 i5Var2 = (i5) this.f26986b;
                TLRPC.User user = (TLRPC.User) this.f26987c;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.personal) {
                        for (int i7 = 0; i7 < updates.users.size(); i7++) {
                            if (updates.users.get(i7).f28580id == user.f28580id) {
                                updates.users.get(i7).photo = user.photo;
                            }
                        }
                    }
                    i5Var2.getMessagesController().V3(updates, false);
                    for (int i10 = 0; i10 < updates.users.size(); i10++) {
                        TLRPC.User user2 = updates.users.get(i10);
                        if (user2.f28580id == user.f28580id) {
                            Utilities.h.c(new w3(29, i5Var2, user2));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user2.f28580id;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(tL_contact);
                            i5Var2.getMessagesStorage().c1(arrayList, false);
                            if (!TextUtils.isEmpty(user2.phone)) {
                                i5.m(0, user2.first_name, user2.last_name);
                                i5Var2.getMessagesStorage().f(user2.phone, "");
                                f5 f5Var = (f5) i5Var2.f24586a0.get(user2.phone);
                                if (f5Var != null && (indexOf = f5Var.f23870g.indexOf(user2.phone)) != -1) {
                                    f5Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    g0.g3(new yf(i5Var2, updates, user, 16));
                    return;
                }
                return;
            case 2:
                i5 i5Var3 = (i5) this.f26986b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.f26987c;
                if (tLObject instanceof Vector) {
                    g0.g3(new yf(i5Var3, editor, (Vector) tLObject, 14));
                    return;
                }
                return;
            case 3:
                ri riVar = (ri) this.f26986b;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) this.f26987c;
                riVar.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    riVar.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    return;
                }
                return;
            case 4:
                g0.g3(new kg((ri) this.f26986b, tLObject, (TLRPC.Document) this.f26987c, 1));
                return;
            case 5:
                ri riVar2 = (ri) this.f26986b;
                Runnable runnable = (Runnable) this.f26987c;
                riVar2.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    riVar2.y1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    riVar2.y1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (runnable != null) {
                    g0.g3(runnable);
                    return;
                }
                return;
            case 6:
                g0.g3(new kg((mp) this.f26986b, tLObject, (ArrayList) this.f26987c, 8));
                return;
            case 7:
                mp mpVar = (mp) this.f26986b;
                Runnable runnable2 = (Runnable) this.f26987c;
                mpVar.getClass();
                if (tL_error == null) {
                    mpVar.V3((TLRPC.Updates) tLObject, false);
                    if (runnable2 != null) {
                        g0.g3(runnable2);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                g0.g3(new tl((pv) this.f26986b, tLObject, (ArrayList) this.f26987c, tL_error, 22));
                return;
            case 9:
                zy zyVar = (zy) this.f26986b;
                Runnable runnable3 = (Runnable) this.f26987c;
                if (tLObject != null) {
                    zyVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    if (runnable3 != null) {
                        g0.g3(runnable3);
                        return;
                    }
                    return;
                }
                zyVar.getClass();
                return;
            default:
                g0.h3(new k10((m10) this.f26986b, (String) this.f26987c, tL_error, tLObject, 0), 2L);
                return;
        }
    }
}
