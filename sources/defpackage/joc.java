package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
public final class joc {
    public int[] A;
    public int[] B;
    public boolean C;
    public boolean D;
    public int E;
    public Path F;
    public Bitmap G;
    public byte H;
    public long I;
    public long J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final String a;
    public float a0;
    public TL_wallet.nftItem b;
    public float b0;
    public final ml c;
    public float c0;
    public final ImageReceiver d;
    public final koc d0;
    public final ioc e;
    public final ioc f;
    public final ioc g;
    public final ioc h;
    public final ioc i;
    public final ioc j;
    public final ioc k;
    public final ioc l;
    public final ioc m;
    public final ioc n;
    public final ioc o;
    public final ioc p;
    public final ioc q;
    public final ioc r;
    public final ioc[] s;
    public final TL_stars.starGiftAttributeBackdrop t;
    public Bitmap u;
    public Bitmap v;
    public Bitmap w;
    public Canvas x;
    public int[] y;
    public int[] z;

    public joc(koc kocVar, TL_wallet.nftItem nftitem) {
        d dVar = kocVar.a;
        this.d0 = kocVar;
        this.c = new ml(this, kocVar, (byte) 7);
        this.d = new ImageReceiver(kocVar.N);
        ioc iocVar = new ioc(0.0f, 900.0f, 0.86f);
        this.e = iocVar;
        ioc iocVar2 = new ioc(0.0f, 900.0f, 0.86f);
        this.f = iocVar2;
        ioc iocVar3 = new ioc(1.0f, 420.0f, 0.78f);
        this.g = iocVar3;
        ioc iocVar4 = new ioc(1.0f, 700.0f, 0.9f);
        this.h = iocVar4;
        ioc iocVar5 = new ioc(0.0f, 700.0f, 0.9f);
        this.i = iocVar5;
        ioc iocVar6 = new ioc(0.0f, 380.0f, 0.82f);
        this.j = iocVar6;
        ioc iocVar7 = new ioc(0.0f, 30.0f, 1.0f);
        this.k = iocVar7;
        ioc iocVar8 = new ioc(0.0f, 520.0f, 0.62f);
        this.l = iocVar8;
        ioc iocVar9 = new ioc(0.0f, 300.0f, 1.0f);
        this.m = iocVar9;
        ioc iocVar10 = new ioc(0.0f, 150.0f, 0.82f);
        this.n = iocVar10;
        ioc iocVar11 = new ioc(0.0f, 150.0f, 0.82f);
        this.o = iocVar11;
        ioc iocVar12 = new ioc(0.0f, 240.0f, 1.0f);
        this.p = iocVar12;
        ioc iocVar13 = new ioc(0.0f, 700.0f, 1.0f);
        this.q = iocVar13;
        ioc iocVar14 = new ioc(1.0f, 260.0f, 1.0f);
        this.r = iocVar14;
        this.s = new ioc[]{iocVar, iocVar2, iocVar3, iocVar4, iocVar5, iocVar6, iocVar7, iocVar8, iocVar9, iocVar10, iocVar11, iocVar12, iocVar13, iocVar14};
        this.E = -2;
        this.V = 1.0f;
        this.c0 = 1.0f;
        this.b = nftitem;
        this.a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i);
            i++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.d0(gl5.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        dkc dkcVar = new dkc(this, (byte) 3);
        ml mlVar = this.c;
        mlVar.h1 = dkcVar;
        this.d.h1 = dkcVar;
        mlVar.d = dVar.getCurrentAccount();
        this.d.d = dVar.getCurrentAccount();
        ml mlVar2 = this.c;
        mlVar2.v0 = false;
        mlVar2.M(1);
        this.c.d0(gl5.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (kocVar.isAttachedToWindow()) {
            this.c.I();
            this.d.I();
        }
    }

    public final Bitmap a() {
        int i;
        koc kocVar = this.d0;
        RectF rectF = kocVar.F;
        ml mlVar = this.c;
        Bitmap n = mlVar.n();
        if (n != null && !n.isRecycled()) {
            oy8 y = mlVar.y();
            if (y == null) {
                i = 0;
            } else {
                i = y.b0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n && this.E == i) {
                return this.u;
            }
            this.G = n;
            this.E = i;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.x.drawBitmap(n, (Rect) null, rectF, kocVar.E);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.u;
        }
        return this.u;
    }

    public final boolean b() {
        byte b = this.H;
        if (b == 2 || b == 1) {
            return true;
        }
        return false;
    }

    public final void c() {
        int[] iArr;
        boolean z;
        int[] iArr2 = this.y;
        if (iArr2 == null) {
            int[] iArr3 = new int[82944];
            this.y = iArr3;
            this.z = new int[82944];
            this.A = new int[82944];
            do3 do3Var = dqc.a;
            this.B = new int[288];
            iArr = iArr3;
        } else {
            iArr = iArr2;
        }
        this.v.getPixels(iArr, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.w == null) {
            z = true;
        } else {
            z = false;
        }
        int[] iArr4 = this.y;
        int[] iArr5 = this.z;
        int[] iArr6 = this.A;
        ?? r8 = this.B;
        do3 do3Var2 = dqc.a;
        if (do3Var2 == null) {
            do3Var2 = new do3("walletStickerOutline", true);
            dqc.a = do3Var2;
        }
        do3Var2.postRunnable(new z2a(this, iArr4, iArr5, iArr6, (Serializable) r8, z, (byte) 13));
    }
}
