package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class ob0 extends FrameLayout {
    public final nb0 E;
    public vl a;
    public vl b;
    public be0 c;
    public be0 d;
    public kz4 e;
    public kz4 f;
    public final TextView h;
    public final TLRPC.TL_emojiList n;
    public final int r;
    public int s;
    public int w;
    public float x;
    public boolean y;

    public ob0(Context context) {
        super(context);
        int i = y6c.t0;
        this.r = i;
        this.s = 0;
        this.w = 0;
        this.x = 1.0f;
        this.E = new nb0((d52) this);
        TLRPC.TL_emojiList a = a(i);
        this.n = a;
        this.c = new be0(context);
        this.d = new be0(context);
        addView(this.c, nme.e(50, 50, 1));
        addView(this.d, nme.e(50, 50, 1));
        if (!a.document_id.isEmpty()) {
            vl vlVar = new vl(4, i, a.document_id.get(0).longValue());
            this.a = vlVar;
            this.c.setAnimatedEmojiDrawable(vlVar);
            b();
        }
        int[] iArr = mb0.d0[this.s];
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        kz4 kz4Var = new kz4();
        this.e = kz4Var;
        kz4Var.d(i2, i3, i4, i5);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        zkb.X(textView, bkb.I7, null);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setText(k96.M0(2131743558, null));
        addView(textView, nme.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i) {
        TLRPC.TL_emojiList tL_emojiList = hq6.d0(i).N1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList t0 = hq6.d0(i).t0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (t0.isEmpty()) {
            ArrayList arrayList = hq6.d0(i).t0[1];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i2);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).id));
                    }
                }
            }
        } else {
            for (int i3 = 0; i3 < t0.size(); i3++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) t0.get(i3);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(((int) Utilities.c.nextLong()) % tL_messages_stickerSet.documents.size())).id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.y) {
            return;
        }
        int i = this.w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.n;
        if (i > tL_emojiList.document_id.size() - 1) {
            this.y = true;
            return;
        }
        vl vlVar = new vl(4, this.r, tL_emojiList.document_id.get(i).longValue());
        this.b = vlVar;
        vlVar.m = true;
        vlVar.u();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        be0 be0Var;
        kz4 kz4Var = this.e;
        if (kz4Var != null) {
            kz4Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        kz4 kz4Var2 = this.f;
        if (kz4Var2 != null) {
            kz4Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f = this.x;
        if (f == 1.0f) {
            this.e.c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.c.setAlpha(1.0f);
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = s33.f.getInterpolation(f);
            this.e.c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.f.c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f.c);
            this.x += 0.064f;
            float f2 = 1.0f - interpolation;
            this.c.setAlpha(f2);
            this.c.setScaleX(f2);
            this.c.setScaleY(f2);
            this.c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(be0Var.getMeasuredHeight());
            if (this.x > 1.0f) {
                this.x = 1.0f;
                this.e = this.f;
                be0 be0Var2 = this.c;
                this.c = this.d;
                this.d = be0Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public vl getAnimatedEmoji() {
        return this.a;
    }

    public hb0 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = mb0.d0[this.s];
        obj.c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gl.d3(this.E, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gl.r(this.E);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int top = this.h.getTop();
        int i3 = (int) (top * 0.7f);
        int i4 = (int) ((top - i3) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        this.c.getLayoutParams().height = i3;
        layoutParams.width = i3;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i3;
        layoutParams2.width = i3;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).topMargin = i4;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i4;
    }
}
