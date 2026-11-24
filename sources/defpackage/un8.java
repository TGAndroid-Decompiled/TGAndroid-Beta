package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class un8 implements qac {
    public final byte a = 2;
    public final boolean b;
    public final Object c;
    public final jm7 d;
    public final Object e;
    public final Object f;
    public final Object g;

    public un8(vz9 vz9Var, boolean z, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.d = vz9Var;
        this.b = z;
        this.e = linkedHashSet;
        this.c = str;
        this.f = hashMap;
        this.g = arrayList;
    }

    @Override
    public final void a(Object obj) {
        boolean z;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) jm7Var;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj5;
                TLRPC.User user = (TLRPC.User) obj4;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                String str = (String) obj2;
                Integer num = (Integer) obj;
                RectF rectF = ProfileActivity.e7;
                boolean z2 = this.b;
                if (channelParticipant != null) {
                    profileActivity.h3(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z2);
                    return;
                } else {
                    profileActivity.h3(num.intValue(), user, chatParticipant, null, null, str, z2);
                    return;
                }
            case 1:
                vz9 vz9Var = (vz9) jm7Var;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj5;
                String str2 = (String) obj2;
                HashMap hashMap = (HashMap) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj;
                int i = vz9Var.W;
                if (this.b) {
                    ArrayList t0 = hs6.d0(i).t0(5);
                    for (int i2 = 0; i2 < t0.size(); i2++) {
                        if (((TLRPC.TL_messages_stickerSet) t0.get(i2)).documents != null && (arrayList2 = ((TLRPC.TL_messages_stickerSet) t0.get(i2)).documents) != null) {
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                String V = k47.V(arrayList2.get(i3), null, null);
                                long j = arrayList2.get(i3).id;
                                if (V != null && !linkedHashSet.contains(Long.valueOf(j)) && str2.contains(V.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = hs6.d0(i).t0[1];
                    for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                        if ((arrayList4.get(i4) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i4)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i4)).documents) != null) {
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                String V2 = k47.V(arrayList.get(i5), null, null);
                                long j2 = arrayList.get(i5).id;
                                if (V2 != null && !linkedHashSet.contains(Long.valueOf(j2)) && str2.contains(V2)) {
                                    linkedHashSet.add(Long.valueOf(j2));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                hs6 d0 = hs6.d0(i);
                String[] strArr = vz9.c2;
                ki kiVar = new ki(vz9Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (vz9Var.a0 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                d0.X(strArr, str2, false, kiVar, true, z, false, false, 30);
                return;
            default:
                ((a6a) jm7Var).O((TLObject) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj3, (m5a) obj2, this.b);
                return;
        }
    }

    public un8(a6a a6aVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, m5a m5aVar, boolean z) {
        this.d = a6aVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.c = m5aVar;
        this.b = z;
    }

    public un8(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z, String str) {
        this.d = profileActivity;
        this.e = channelParticipant;
        this.f = user;
        this.g = chatParticipant;
        this.b = z;
        this.c = str;
    }
}
