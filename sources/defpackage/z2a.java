package defpackage;

import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z2a implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public z2a(t14 t14Var, um4 um4Var, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z) {
        this.a = (byte) 8;
        this.c = t14Var;
        this.e = um4Var;
        this.d = tLObject;
        this.f = stickerSet;
        this.h = document;
        this.b = z;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z2a.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z2a.run():void");
    }

    public z2a(mu1 mu1Var, gb2 gb2Var, boolean z, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = (byte) 3;
        this.f = mu1Var;
        this.c = gb2Var;
        this.b = z;
        this.h = str;
        this.d = userArr;
        this.e = characterStyle;
    }

    public z2a(c92 c92Var, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z, TLRPC.TL_error tL_error) {
        this.a = (byte) 5;
        this.c = c92Var;
        this.e = tL_channels_toggleUsername;
        this.d = tLObject;
        this.f = tL_username;
        this.b = z;
        this.h = tL_error;
    }

    public z2a(qu2 qu2Var, boolean z, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = (byte) 6;
        this.c = qu2Var;
        this.b = z;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public z2a(q03 q03Var, TLObject tLObject, u41 u41Var, boolean z, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.a = (byte) 7;
        this.c = q03Var;
        this.d = tLObject;
        this.e = u41Var;
        this.b = z;
        this.f = hashSet;
        this.h = tL_error;
    }

    public z2a(mu1 mu1Var, hd hdVar, boolean[] zArr, boolean z, k27 k27Var, TLRPC.TL_webPage tL_webPage) {
        this.a = (byte) 4;
        this.f = mu1Var;
        this.c = hdVar;
        this.d = zArr;
        this.b = z;
        this.e = k27Var;
        this.h = tL_webPage;
    }

    public z2a(KeyEvent.Callback callback, TLRPC.TL_error tL_error, Object obj, Object obj2, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.c = callback;
        this.e = tL_error;
        this.f = obj;
        this.h = obj2;
        this.b = z;
        this.d = tLObject;
    }

    public z2a(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = serializable;
        this.b = z;
    }

    public z2a(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
        this.h = obj5;
    }
}
