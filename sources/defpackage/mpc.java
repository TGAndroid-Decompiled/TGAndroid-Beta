package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.utils.twidget.z;
public final class mpc implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public mpc(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        byte b;
        q0d q0dVar;
        e eVar;
        boolean z = false;
        switch (this.a) {
            case 0:
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.b);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new ic((byte) 0), new p((gpc) this.c, (c) this.d, connectionsManager, (byte) 27));
                return;
            case 1:
                Context context = (Context) this.c;
                int i = this.b;
                String str = ((TL_wallet.walletTransaction[]) this.d)[0].tx_hash;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = uc7.s1(i).l4.O1.f;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "https://tonviewer.com/";
                    } else if (!str2.endsWith("/")) {
                        str2 = str2.concat("/");
                    }
                    StringBuilder l = c00.l(str2, "transaction/");
                    l.append(Uri.encode(str));
                    m01.w(context, l.toString(), false);
                    return;
                }
                return;
            case 2:
                wqc wqcVar = (wqc) this.c;
                int i2 = this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (wqcVar.f0 == i2) {
                    wqcVar.f(bitmapArr);
                    wqcVar.a.run();
                    return;
                }
                return;
            case 3:
                int i3 = this.b;
                zuc zucVar = (zuc) this.d;
                int i4 = i3 + 1;
                ArrayList arrayList = ((atc) this.c).w;
                if (i4 < arrayList.size()) {
                    ((zuc) arrayList.get(i4)).a.requestFocus();
                    return;
                } else {
                    hl.t1(zucVar);
                    return;
                }
            case 4:
                int i5 = this.b;
                zuc zucVar2 = (zuc) this.d;
                int i6 = i5 + 1;
                ArrayList arrayList2 = ((tuc) this.c).d;
                if (i6 < arrayList2.size()) {
                    ((zuc) arrayList2.get(i6)).a.requestFocus();
                    return;
                } else {
                    hl.t1(zucVar2);
                    return;
                }
            case 5:
                int i7 = this.b;
                String str3 = (String) this.c;
                pcc pccVar = (pcc) this.d;
                lvc[] lvcVarArr = lvc.f;
                lvc lvcVar = lvcVarArr[i7];
                if (lvcVar == null) {
                    lvcVar = new lvc(i7);
                    lvcVarArr[i7] = lvcVar;
                }
                lvcVar.d(str3, true, null, null, pccVar);
                return;
            case 6:
                cwc cwcVar = (cwc) this.c;
                int i8 = this.b;
                TLObject tLObject = (TLObject) this.d;
                HashMap hashMap = cwcVar.e;
                WallpapersListActivity wallpapersListActivity = cwcVar.F;
                ArrayList arrayList3 = cwcVar.d;
                if (i8 == cwcVar.w) {
                    cwcVar.s = 0;
                    int size = arrayList3.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        cwcVar.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i9);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                ?? obj = new Object();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.Y0(false), false, null, false);
                                    TLRPC.PhotoSize w2 = xb4.w(botInlineResult.photo.sizes, 320, false, null, false);
                                    if (w != null) {
                                        obj.E = w.w;
                                        obj.F = w.h;
                                        obj.L = w;
                                        obj.K = botInlineResult.photo;
                                        obj.G = w.size;
                                        obj.M = w2;
                                        obj.B = botInlineResult.id;
                                        obj.H = false;
                                        arrayList3.add(obj);
                                        hashMap.put(obj.B, obj);
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i10);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                obj.E = documentAttribute.w;
                                                obj.F = documentAttribute.h;
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                    TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        obj.D = webDocument.url;
                                    } else {
                                        obj.D = null;
                                    }
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    obj.C = webDocument2.url;
                                    obj.G = webDocument2.size;
                                    obj.B = botInlineResult.id;
                                    obj.H = false;
                                    arrayList3.add(obj);
                                    hashMap.put(obj.B, obj);
                                }
                            }
                        }
                        cwcVar.f = (size == arrayList3.size() || cwcVar.r == null) ? true : true;
                    }
                    if (size != arrayList3.size()) {
                        int i11 = size % wallpapersListActivity.O;
                        float f = size;
                        int ceil = (int) Math.ceil(f / b);
                        if (i11 != 0) {
                            cwcVar.g(((int) Math.ceil(f / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.I.p(ceil, ((int) Math.ceil(arrayList3.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.L.c();
                    return;
                }
                return;
            default:
                z zVar = (z) this.c;
                int i12 = this.b;
                String str4 = (String) this.d;
                if (!zVar.A && (q0dVar = zVar.R) != null) {
                    if (i12 == 13) {
                        if (q0dVar.d != null && !TextUtils.isEmpty(str4)) {
                            hl.g(str4);
                            if (hl.C3()) {
                                eVar = LaunchActivity.S();
                            } else {
                                eVar = null;
                            }
                            if (eVar != null) {
                                if (str4.length() > 80) {
                                    str4 = str4.substring(0, 80).concat("…");
                                }
                                d31.b0(eVar).Q(2131623994, 36, ob6.a0(null, null, 2131742497, str4)).j();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    boolean equals = "1".equals(str4);
                    if (q0dVar.z != equals) {
                        q0dVar.z = equals;
                        z3f z3fVar = q0dVar.d;
                        if (z3fVar != null) {
                            z3fVar.getClass();
                            k0d.F();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public mpc(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
