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
import org.telegram.ui.ActionBar.e;
public final class vsc {
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
    public final nl c;
    public float c0;
    public final ImageReceiver d;
    public final wsc d0;
    public final usc e;
    public final usc f;
    public final usc g;
    public final usc h;
    public final usc i;
    public final usc j;
    public final usc k;
    public final usc l;
    public final usc m;
    public final usc n;
    public final usc o;
    public final usc p;
    public final usc q;
    public final usc r;
    public final usc[] s;
    public final TL_stars.starGiftAttributeBackdrop t;
    public Bitmap u;
    public Bitmap v;
    public Bitmap w;
    public Canvas x;
    public int[] y;
    public int[] z;

    public vsc(wsc wscVar, TL_wallet.nftItem nftitem) {
        e eVar = wscVar.a;
        this.d0 = wscVar;
        this.c = new nl(this, wscVar, (byte) 7);
        this.d = new ImageReceiver(wscVar.N);
        usc uscVar = new usc(0.0f, 900.0f, 0.86f);
        this.e = uscVar;
        usc uscVar2 = new usc(0.0f, 900.0f, 0.86f);
        this.f = uscVar2;
        usc uscVar3 = new usc(1.0f, 420.0f, 0.78f);
        this.g = uscVar3;
        usc uscVar4 = new usc(1.0f, 700.0f, 0.9f);
        this.h = uscVar4;
        usc uscVar5 = new usc(0.0f, 700.0f, 0.9f);
        this.i = uscVar5;
        usc uscVar6 = new usc(0.0f, 380.0f, 0.82f);
        this.j = uscVar6;
        usc uscVar7 = new usc(0.0f, 30.0f, 1.0f);
        this.k = uscVar7;
        usc uscVar8 = new usc(0.0f, 520.0f, 0.62f);
        this.l = uscVar8;
        usc uscVar9 = new usc(0.0f, 300.0f, 1.0f);
        this.m = uscVar9;
        usc uscVar10 = new usc(0.0f, 150.0f, 0.82f);
        this.n = uscVar10;
        usc uscVar11 = new usc(0.0f, 150.0f, 0.82f);
        this.o = uscVar11;
        usc uscVar12 = new usc(0.0f, 240.0f, 1.0f);
        this.p = uscVar12;
        usc uscVar13 = new usc(0.0f, 700.0f, 1.0f);
        this.q = uscVar13;
        usc uscVar14 = new usc(1.0f, 260.0f, 1.0f);
        this.r = uscVar14;
        this.s = new usc[]{uscVar, uscVar2, uscVar3, uscVar4, uscVar5, uscVar6, uscVar7, uscVar8, uscVar9, uscVar10, uscVar11, uscVar12, uscVar13, uscVar14};
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
                this.d.d0(jn5.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        ftb ftbVar = new ftb(this, (byte) 17);
        nl nlVar = this.c;
        nlVar.h1 = ftbVar;
        this.d.h1 = ftbVar;
        nlVar.d = eVar.getCurrentAccount();
        this.d.d = eVar.getCurrentAccount();
        nl nlVar2 = this.c;
        nlVar2.v0 = false;
        nlVar2.M(1);
        this.c.d0(jn5.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (wscVar.isAttachedToWindow()) {
            this.c.I();
            this.d.I();
        }
    }

    public final Bitmap a() {
        int i;
        wsc wscVar = this.d0;
        RectF rectF = wscVar.F;
        nl nlVar = this.c;
        Bitmap n = nlVar.n();
        if (n != null && !n.isRecycled()) {
            b29 y = nlVar.y();
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
            this.x.drawBitmap(n, (Rect) null, rectF, wscVar.E);
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
            uo3 uo3Var = ruc.a;
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
        uo3 uo3Var2 = ruc.a;
        if (uo3Var2 == null) {
            uo3Var2 = new uo3("walletStickerOutline", true);
            ruc.a = uo3Var2;
        }
        uo3Var2.postRunnable(new y6a(this, iArr4, iArr5, iArr6, (Serializable) r8, z, (byte) 13));
    }
}
