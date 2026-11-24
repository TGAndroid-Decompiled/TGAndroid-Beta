package defpackage;

import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b5a implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public b5a(e34 e34Var, vo4 vo4Var, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z) {
        this.a = (byte) 8;
        this.c = e34Var;
        this.e = vo4Var;
        this.d = tLObject;
        this.f = stickerSet;
        this.h = document;
        this.b = z;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5a.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5a.run():void");
    }

    public b5a(yv1 yv1Var, rc2 rc2Var, boolean z, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = (byte) 3;
        this.f = yv1Var;
        this.c = rc2Var;
        this.b = z;
        this.h = str;
        this.d = userArr;
        this.e = characterStyle;
    }

    public b5a(na2 na2Var, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z, TLRPC.TL_error tL_error) {
        this.a = (byte) 5;
        this.c = na2Var;
        this.e = tL_channels_toggleUsername;
        this.d = tLObject;
        this.f = tL_username;
        this.b = z;
        this.h = tL_error;
    }

    public b5a(bw2 bw2Var, boolean z, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = (byte) 6;
        this.c = bw2Var;
        this.b = z;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public b5a(c23 c23Var, TLObject tLObject, b61 b61Var, boolean z, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.a = (byte) 7;
        this.c = c23Var;
        this.d = tLObject;
        this.e = b61Var;
        this.b = z;
        this.f = hashSet;
        this.h = tL_error;
    }

    public b5a(yv1 yv1Var, he heVar, boolean[] zArr, boolean z, k47 k47Var, TLRPC.TL_webPage tL_webPage) {
        this.a = (byte) 4;
        this.f = yv1Var;
        this.c = heVar;
        this.d = zArr;
        this.b = z;
        this.e = k47Var;
        this.h = tL_webPage;
    }

    public b5a(KeyEvent.Callback callback, TLRPC.TL_error tL_error, Object obj, Object obj2, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.c = callback;
        this.e = tL_error;
        this.f = obj;
        this.h = obj2;
        this.b = z;
        this.d = tLObject;
    }

    public b5a(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = serializable;
        this.b = z;
    }

    public b5a(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
        this.h = obj5;
    }
}
