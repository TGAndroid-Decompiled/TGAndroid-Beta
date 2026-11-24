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
public final class lqc {
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
    public final mm c;
    public float c0;
    public final ImageReceiver d;
    public final mqc d0;
    public final kqc e;
    public final kqc f;
    public final kqc g;
    public final kqc h;
    public final kqc i;
    public final kqc j;
    public final kqc k;
    public final kqc l;
    public final kqc m;
    public final kqc n;
    public final kqc o;
    public final kqc p;
    public final kqc q;
    public final kqc r;
    public final kqc[] s;
    public final TL_stars.starGiftAttributeBackdrop t;
    public Bitmap u;
    public Bitmap v;
    public Bitmap w;
    public Canvas x;
    public int[] y;
    public int[] z;

    public lqc(mqc mqcVar, TL_wallet.nftItem nftitem) {
        d dVar = mqcVar.a;
        this.d0 = mqcVar;
        this.c = new mm(this, mqcVar, (byte) 7);
        this.d = new ImageReceiver(mqcVar.N);
        kqc kqcVar = new kqc(0.0f, 900.0f, 0.86f);
        this.e = kqcVar;
        kqc kqcVar2 = new kqc(0.0f, 900.0f, 0.86f);
        this.f = kqcVar2;
        kqc kqcVar3 = new kqc(1.0f, 420.0f, 0.78f);
        this.g = kqcVar3;
        kqc kqcVar4 = new kqc(1.0f, 700.0f, 0.9f);
        this.h = kqcVar4;
        kqc kqcVar5 = new kqc(0.0f, 700.0f, 0.9f);
        this.i = kqcVar5;
        kqc kqcVar6 = new kqc(0.0f, 380.0f, 0.82f);
        this.j = kqcVar6;
        kqc kqcVar7 = new kqc(0.0f, 30.0f, 1.0f);
        this.k = kqcVar7;
        kqc kqcVar8 = new kqc(0.0f, 520.0f, 0.62f);
        this.l = kqcVar8;
        kqc kqcVar9 = new kqc(0.0f, 300.0f, 1.0f);
        this.m = kqcVar9;
        kqc kqcVar10 = new kqc(0.0f, 150.0f, 0.82f);
        this.n = kqcVar10;
        kqc kqcVar11 = new kqc(0.0f, 150.0f, 0.82f);
        this.o = kqcVar11;
        kqc kqcVar12 = new kqc(0.0f, 240.0f, 1.0f);
        this.p = kqcVar12;
        kqc kqcVar13 = new kqc(0.0f, 700.0f, 1.0f);
        this.q = kqcVar13;
        kqc kqcVar14 = new kqc(1.0f, 260.0f, 1.0f);
        this.r = kqcVar14;
        this.s = new kqc[]{kqcVar, kqcVar2, kqcVar3, kqcVar4, kqcVar5, kqcVar6, kqcVar7, kqcVar8, kqcVar9, kqcVar10, kqcVar11, kqcVar12, kqcVar13, kqcVar14};
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
                this.d.d0(gn5.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        lcc lccVar = new lcc(this, (byte) 7);
        mm mmVar = this.c;
        mmVar.h1 = lccVar;
        this.d.h1 = lccVar;
        mmVar.d = dVar.getCurrentAccount();
        this.d.d = dVar.getCurrentAccount();
        mm mmVar2 = this.c;
        mmVar2.v0 = false;
        mmVar2.M(1);
        this.c.d0(gn5.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (mqcVar.isAttachedToWindow()) {
            this.c.I();
            this.d.I();
        }
    }

    public final Bitmap a() {
        int i;
        mqc mqcVar = this.d0;
        RectF rectF = mqcVar.F;
        mm mmVar = this.c;
        Bitmap n = mmVar.n();
        if (n != null && !n.isRecycled()) {
            p09 y = mmVar.y();
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
            this.x.drawBitmap(n, (Rect) null, rectF, mqcVar.E);
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
            np3 np3Var = fsc.a;
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
        np3 np3Var2 = fsc.a;
        if (np3Var2 == null) {
            np3Var2 = new np3("walletStickerOutline", true);
            fsc.a = np3Var2;
        }
        np3Var2.postRunnable(new b5a(this, iArr4, iArr5, iArr6, (Serializable) r8, z, (byte) 13));
    }
}
