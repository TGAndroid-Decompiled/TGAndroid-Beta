package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class y85 {
    public final int a;
    public lv3 c;
    public wl d;
    public boolean e;
    public boolean f;
    public long g;
    public String l;
    public final Drawable[] b = new Drawable[6];
    public final pm3 h = new pm3((byte) 7);
    public final HashSet i = new HashSet();
    public boolean j = false;
    public final jb2 k = new jb2(this, (byte) 1);
    public final RectF m = new RectF();

    public y85(int i) {
        int i2 = 0;
        this.a = i;
        while (true) {
            Drawable[] drawableArr = this.b;
            if (i2 < drawableArr.length) {
                drawableArr[i2] = pv3.g(j95.c1());
                i2++;
            } else {
                this.g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.i.isEmpty();
        boolean z = !isEmpty;
        if (this.j != z) {
            this.j = z;
            wl wlVar = this.d;
            jb2 jb2Var = this.k;
            if (!isEmpty) {
                if (wlVar != null) {
                    wlVar.a(jb2Var);
                }
            } else if (wlVar != null) {
                wlVar.n(jb2Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f) {
        long j;
        float f2;
        float L = hl.L(6.0f);
        RectF rectF2 = this.m;
        rectF2.set(rectF);
        float f3 = -L;
        rectF2.inset(f3, f3);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.a * 45) + System.currentTimeMillis();
        long j2 = currentTimeMillis - this.g;
        float f4 = ((float) j2) / 180.0f;
        float min = Math.min(1.0f, f4);
        boolean z = this.f;
        Drawable[] drawableArr = this.b;
        boolean z2 = false;
        if (z && this.d != null && this.c != null && this.e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + L));
            if (f < 1.0f) {
                canvas.save();
                f2 = 0.0f;
                j = j2;
                this.c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.c.setAlpha((int) ((1.0f - f) * 255.0f));
                this.c.draw(canvas);
                this.c.setAlpha(255);
                canvas.restore();
            } else {
                j = j2;
                f2 = 0.0f;
            }
            if (f > f2) {
                canvas.save();
                rectF2.inset(hl.L(-4.0f), hl.L(-4.0f));
                this.d.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.d.setAlpha((int) (f * 255.0f));
                this.d.draw(canvas);
                this.d.setAlpha(255);
                canvas.restore();
            }
        } else {
            j = j2;
            canvas.save();
            rectF2.set(rectF);
            rectF2.offset(0.0f, (rectF.height() + L) * (min - 1.0f));
            canvas.translate(rectF2.left, rectF2.top);
            drawableArr[1].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
            drawableArr[1].setAlpha(127);
            drawableArr[1].draw(canvas);
            drawableArr[1].setAlpha(255);
            canvas.restore();
        }
        rectF2.set(rectF);
        rectF2.offset(0.0f, (rectF.height() + L) * min);
        canvas.save();
        canvas.translate(rectF2.left, rectF2.top);
        drawableArr[0].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
        drawableArr[0].setAlpha(127);
        drawableArr[0].draw(canvas);
        drawableArr[0].setAlpha(255);
        canvas.restore();
        if (f4 >= 1.0f) {
            if (this.f && this.e) {
                z2 = true;
            } else {
                this.g = currentTimeMillis - (j % 180);
                int i = 0;
                while (i < drawableArr.length - 1) {
                    int i2 = i + 1;
                    drawableArr[i] = drawableArr[i2];
                    i = i2;
                }
                drawableArr[drawableArr.length - 1] = pv3.g(j95.c1());
                if (this.f) {
                    this.e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f5 = (int) f3;
        rectF2.inset(f5, f5);
        float f6 = rectF2.left;
        float f7 = rectF2.top;
        rectF2.set(f6, f7, rectF2.right, f7 + L);
        pm3 pm3Var = this.h;
        pm3Var.r(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f5, f5);
        float f8 = rectF2.left;
        float f9 = rectF2.bottom;
        rectF2.set(f8, f9 - L, rectF2.right, f9);
        pm3Var.r(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z2;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.l != null) {
            int k = yac.k();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet m0 = ls6.d0(k).m0(tL_inputStickerSetShortName, 0, false, true, new zj3(this, (byte) 16));
            if (m0 != null) {
                String replace = this.l.replace("️", "");
                ArrayList<TLRPC.Document> arrayList = m0.documents;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    document = null;
                    if (i >= size) {
                        break;
                    }
                    TLRPC.Document document2 = arrayList.get(i);
                    i++;
                    TLRPC.Document document3 = document2;
                    if (TextUtils.equals(r47.V(document3, null, null).replace("️", ""), replace)) {
                        document = document3;
                        break;
                    }
                }
                if (document != null) {
                    wl wlVar = this.d;
                    wlVar.e = document;
                    wlVar.i(false);
                    return;
                }
                cc4.d("emoji \"" + this.l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}
