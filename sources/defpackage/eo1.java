package defpackage;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class eo1 implements View.OnClickListener {
    public final byte a;
    public final zu1 b;
    public final int c;
    public final ArrayList d;
    public final String e;
    public final String f;
    public final Serializable h;
    public final TLRPC.InputPeer n;
    public final int[] r;
    public final boolean s;
    public final do1 w;
    public final Object x;

    public eo1(zu1 zu1Var, int i, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, do1 do1Var) {
        this.a = (byte) 2;
        this.b = zu1Var;
        this.c = i;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f = str2;
        this.n = inputPeer;
        this.r = iArr;
        this.x = charSequence;
        this.s = z;
        this.w = do1Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.x;
        Serializable serializable = this.h;
        switch (b) {
            case 0:
                this.b.v8(this.c, this.d, this.e, this.f, (String) serializable, this.n, this.r, (TL_iv.RichMessage) obj, this.s, this.w);
                return;
            case 1:
                this.b.w8(this.c, this.d, this.e, this.f, (String) serializable, this.n, this.r, (CharSequence) obj, this.s, this.w);
                return;
            default:
                boolean z = this.s;
                do1 do1Var = this.w;
                this.b.x8(this.c, this.d, (String[]) serializable, this.e, this.f, this.n, this.r, (CharSequence) obj, z, do1Var);
                return;
        }
    }

    public eo1(zu1 zu1Var, int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z, do1 do1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = i;
        this.d = arrayList;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.n = inputPeer;
        this.r = iArr;
        this.x = obj;
        this.s = z;
        this.w = do1Var;
    }
}
