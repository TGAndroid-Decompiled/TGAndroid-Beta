package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public abstract class yy3 implements jm7 {
    public final ArrayList a;
    public ArrayList b;
    public ArrayList[] c;
    public final int d;
    public boolean e = false;
    public final az3 f;

    public yy3(az3 az3Var, int i, ArrayList arrayList) {
        this.f = az3Var;
        this.d = i;
        this.a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i2;
        ArrayList<Long> arrayList;
        if (i >= 0) {
            ArrayList[] arrayListArr = this.c;
            if (i < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i] = new ArrayList();
                    for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i3);
                        if (document == null) {
                            this.c[i].add(null);
                        } else {
                            ?? obj = new Object();
                            long j = document.id;
                            for (int i4 = 0; i4 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i4).documents) == null || !arrayList.contains(Long.valueOf(j))); i4++) {
                            }
                            obj.a = tL_messages_stickerSet;
                            obj.b = document.id;
                            this.c[i].add(obj);
                            if (this.f.B1) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i2 = 10;
                                } else {
                                    i2 = 16;
                                }
                                if (this.c[i].size() >= i2) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                arrayListArr[i] = new ArrayList(12);
                for (int i5 = 0; i5 < 12; i5++) {
                    this.c[i].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        ms1 ms1Var;
        if (i == nm7.B0) {
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                if (this.b.get(i3) == null) {
                    hs6 d0 = hs6.d0(this.d);
                    ArrayList arrayList = this.a;
                    TLRPC.TL_messages_stickerSet n0 = d0.n0((TLRPC.InputStickerSet) arrayList.get(i3), true);
                    if (this.b.size() == 1 && n0 != null && (stickerSet = n0.set) != null && !stickerSet.emojis) {
                        az3 az3Var = this.f;
                        az3Var.dismiss();
                        Context context = az3Var.getContext();
                        d dVar = az3Var.m1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i3);
                        d dVar2 = az3Var.m1;
                        if (dVar2 instanceof yv1) {
                            ms1Var = ((yv1) dVar2).a0;
                        } else {
                            ms1Var = null;
                        }
                        new x2b(context, dVar, inputStickerSet, null, ms1Var, az3Var.J0).show();
                        return;
                    }
                    this.b.set(i3, n0);
                    if (n0 != null) {
                        a(i3, n0);
                    }
                }
            }
            az3 az3Var2 = ((my3) this).h;
            az3Var2.I0();
            hx hxVar = az3Var2.q1;
            if (hxVar != null && hxVar.getAdapter() != null) {
                hxVar.getAdapter().f();
            }
        }
    }
}
