package defpackage;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class cm1 implements View.OnClickListener {
    public final byte a;
    public final mu1 b;
    public final int c;
    public final ArrayList d;
    public final String e;
    public final String f;
    public final Serializable h;
    public final TLRPC.InputPeer n;
    public final int[] r;
    public final boolean s;
    public final bm1 w;
    public final Object x;

    public cm1(mu1 mu1Var, int i, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, bm1 bm1Var) {
        this.a = (byte) 2;
        this.b = mu1Var;
        this.c = i;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f = str2;
        this.n = inputPeer;
        this.r = iArr;
        this.x = charSequence;
        this.s = z;
        this.w = bm1Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.x;
        Serializable serializable = this.h;
        switch (b) {
            case 0:
                this.b.k8(this.c, this.d, this.e, this.f, (String) serializable, this.n, this.r, (TL_iv.RichMessage) obj, this.s, this.w);
                return;
            case 1:
                this.b.l8(this.c, this.d, this.e, this.f, (String) serializable, this.n, this.r, (CharSequence) obj, this.s, this.w);
                return;
            default:
                boolean z = this.s;
                bm1 bm1Var = this.w;
                this.b.m8(this.c, this.d, (String[]) serializable, this.e, this.f, this.n, this.r, (CharSequence) obj, z, bm1Var);
                return;
        }
    }

    public cm1(mu1 mu1Var, int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z, bm1 bm1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = i;
        this.d = arrayList;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.n = inputPeer;
        this.r = iArr;
        this.x = obj;
        this.s = z;
        this.w = bm1Var;
    }
}
