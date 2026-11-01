package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.tu0;
public final class v4 implements RequestDelegate {
    public final int f18591a;
    public final Object f18592b;
    public final Object f18593c;

    public v4(int i10, Object obj, Object obj2) {
        this.f18591a = i10;
        this.f18592b = obj;
        this.f18593c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        switch (this.f18591a) {
            case 0:
                i5 i5Var = (i5) this.f18592b;
                tu0 tu0Var = (tu0) this.f18593c;
                if (tL_error == null) {
                    i5Var.Z.clear();
                    i5Var.Y.clear();
                    i5Var.m0 = 0;
                    i5Var.f16229s = false;
                    i5Var.e = false;
                    i5Var.h = false;
                    i5Var.f16213b = false;
                    i5Var.f16228r = false;
                    i5Var.f16230w = "";
                    i0.g3(new e4(26, i5Var, tu0Var));
                    return;
                }
                i0.g3(tu0Var);
                return;
            case 1:
                i5 i5Var2 = (i5) this.f18592b;
                TLRPC.User user = (TLRPC.User) this.f18593c;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.personal) {
                        for (int i10 = 0; i10 < updates.users.size(); i10++) {
                            if (updates.users.get(i10).f19943id == user.f19943id) {
                                updates.users.get(i10).photo = user.photo;
                            }
                        }
                    }
                    i5Var2.getMessagesController().L3(updates, false);
                    for (int i11 = 0; i11 < updates.users.size(); i11++) {
                        TLRPC.User user2 = updates.users.get(i11);
                        if (user2.f19943id == user.f19943id) {
                            Utilities.h.c(new e4(27, i5Var2, user2));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user2.f19943id;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(tL_contact);
                            i5Var2.getMessagesStorage().c1(arrayList, false);
                            if (!TextUtils.isEmpty(user2.phone)) {
                                i5.m(0, user2.first_name, user2.last_name);
                                i5Var2.getMessagesStorage().f(user2.phone, "");
                                f5 f5Var = (f5) i5Var2.Z.get(user2.phone);
                                if (f5Var != null && (indexOf = f5Var.f15696g.indexOf(user2.phone)) != -1) {
                                    f5Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    i0.g3(new ng(i5Var2, updates, user, 16));
                    return;
                }
                return;
            case 2:
                i5 i5Var3 = (i5) this.f18592b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.f18593c;
                if (tLObject instanceof Vector) {
                    i0.g3(new ng(i5Var3, editor, (Vector) tLObject, 14));
                    return;
                }
                return;
            case 3:
                vi viVar = (vi) this.f18592b;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) this.f18593c;
                viVar.getClass();
                if (tL_error != null && w8.r(tL_error.text)) {
                    viVar.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    return;
                }
                return;
            case 4:
                i0.g3(new lg((vi) this.f18592b, tLObject, (TLRPC.Document) this.f18593c, 1));
                return;
            case 5:
                vi viVar2 = (vi) this.f18592b;
                Runnable runnable = (Runnable) this.f18593c;
                viVar2.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    viVar2.v1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    viVar2.v1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (runnable != null) {
                    i0.g3(runnable);
                    return;
                }
                return;
            case 6:
                i0.g3(new lg((wp) this.f18592b, tLObject, (ArrayList) this.f18593c, 9));
                return;
            case 7:
                wp wpVar = (wp) this.f18592b;
                Runnable runnable2 = (Runnable) this.f18593c;
                wpVar.getClass();
                if (tL_error == null) {
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    if (runnable2 != null) {
                        i0.g3(runnable2);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                i0.g3(new vl((hw) this.f18592b, tLObject, (ArrayList) this.f18593c, tL_error, 22));
                return;
            case 9:
                i0.g3(new lg((rz) this.f18592b, tLObject, (dz) this.f18593c, 27));
                return;
            case 10:
                rz rzVar = (rz) this.f18592b;
                Runnable runnable3 = (Runnable) this.f18593c;
                if (tLObject != null) {
                    rzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    if (runnable3 != null) {
                        i0.g3(runnable3);
                        return;
                    }
                    return;
                }
                rzVar.getClass();
                return;
            default:
                i0.h3(new f20((h20) this.f18592b, (String) this.f18593c, tL_error, tLObject, 0), 2L);
                return;
        }
    }
}
