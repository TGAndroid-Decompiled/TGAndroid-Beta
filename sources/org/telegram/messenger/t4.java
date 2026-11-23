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
    public final int f26972a;
    public final Object f26973b;
    public final Object f26974c;

    public t4(int i7, Object obj, Object obj2) {
        this.f26972a = i7;
        this.f26973b = obj;
        this.f26974c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        switch (this.f26972a) {
            case 0:
                i5 i5Var = (i5) this.f26973b;
                mt0 mt0Var = (mt0) this.f26974c;
                if (tL_error == null) {
                    i5Var.f24596a0.clear();
                    i5Var.Z.clear();
                    i5Var.f24613n0 = 0;
                    i5Var.f24615s = false;
                    i5Var.f24602e = false;
                    i5Var.h = false;
                    i5Var.f24597b = false;
                    i5Var.f24614r = false;
                    i5Var.f24616w = "";
                    g0.g3(new w3(28, i5Var, mt0Var));
                    return;
                }
                g0.g3(mt0Var);
                return;
            case 1:
                i5 i5Var2 = (i5) this.f26973b;
                TLRPC.User user = (TLRPC.User) this.f26974c;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.personal) {
                        for (int i7 = 0; i7 < updates.users.size(); i7++) {
                            if (updates.users.get(i7).f28583id == user.f28583id) {
                                updates.users.get(i7).photo = user.photo;
                            }
                        }
                    }
                    i5Var2.getMessagesController().V3(updates, false);
                    for (int i10 = 0; i10 < updates.users.size(); i10++) {
                        TLRPC.User user2 = updates.users.get(i10);
                        if (user2.f28583id == user.f28583id) {
                            Utilities.h.c(new w3(29, i5Var2, user2));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user2.f28583id;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(tL_contact);
                            i5Var2.getMessagesStorage().c1(arrayList, false);
                            if (!TextUtils.isEmpty(user2.phone)) {
                                i5.m(0, user2.first_name, user2.last_name);
                                i5Var2.getMessagesStorage().f(user2.phone, "");
                                f5 f5Var = (f5) i5Var2.f24596a0.get(user2.phone);
                                if (f5Var != null && (indexOf = f5Var.f23865g.indexOf(user2.phone)) != -1) {
                                    f5Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    g0.g3(new zf(i5Var2, updates, user, 16));
                    return;
                }
                return;
            case 2:
                i5 i5Var3 = (i5) this.f26973b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.f26974c;
                if (tLObject instanceof Vector) {
                    g0.g3(new zf(i5Var3, editor, (Vector) tLObject, 14));
                    return;
                }
                return;
            case 3:
                si siVar = (si) this.f26973b;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) this.f26974c;
                siVar.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    siVar.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    return;
                }
                return;
            case 4:
                g0.g3(new lg((si) this.f26973b, tLObject, (TLRPC.Document) this.f26974c, 1));
                return;
            case 5:
                si siVar2 = (si) this.f26973b;
                Runnable runnable = (Runnable) this.f26974c;
                siVar2.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    siVar2.y1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    siVar2.y1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (runnable != null) {
                    g0.g3(runnable);
                    return;
                }
                return;
            case 6:
                g0.g3(new lg((np) this.f26973b, tLObject, (ArrayList) this.f26974c, 8));
                return;
            case 7:
                np npVar = (np) this.f26973b;
                Runnable runnable2 = (Runnable) this.f26974c;
                npVar.getClass();
                if (tL_error == null) {
                    npVar.V3((TLRPC.Updates) tLObject, false);
                    if (runnable2 != null) {
                        g0.g3(runnable2);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                g0.g3(new ul((qv) this.f26973b, tLObject, (ArrayList) this.f26974c, tL_error, 22));
                return;
            case 9:
                az azVar = (az) this.f26973b;
                Runnable runnable3 = (Runnable) this.f26974c;
                if (tLObject != null) {
                    azVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    if (runnable3 != null) {
                        g0.g3(runnable3);
                        return;
                    }
                    return;
                }
                azVar.getClass();
                return;
            default:
                g0.h3(new l10((n10) this.f26973b, (String) this.f26974c, tL_error, tLObject, 0), 2L);
                return;
        }
    }
}
