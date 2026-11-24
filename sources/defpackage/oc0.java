package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class oc0 extends FrameLayout {
    public final nc0 E;
    public vm a;
    public vm b;
    public bf0 c;
    public bf0 d;
    public j15 e;
    public j15 f;
    public final TextView h;
    public final TLRPC.TL_emojiList n;
    public final int r;
    public int s;
    public int w;
    public float x;
    public boolean y;

    public oc0(Context context) {
        super(context);
        int i = z8c.t0;
        this.r = i;
        this.s = 0;
        this.w = 0;
        this.x = 1.0f;
        this.E = new nc0((o62) this);
        TLRPC.TL_emojiList a = a(i);
        this.n = a;
        this.c = new bf0(context);
        this.d = new bf0(context);
        addView(this.c, qoe.e(50, 50, 1));
        addView(this.d, qoe.e(50, 50, 1));
        if (!a.document_id.isEmpty()) {
            vm vmVar = new vm(4, i, a.document_id.get(0).longValue());
            this.a = vmVar;
            this.c.setAnimatedEmojiDrawable(vmVar);
            b();
        }
        int[] iArr = mc0.d0[this.s];
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        j15 j15Var = new j15();
        this.e = j15Var;
        j15Var.d(i2, i3, i4, i5);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        anb.X(textView, cmb.I7, null);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        textView.setText(jb6.M0(2131743484, null));
        addView(textView, qoe.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i) {
        TLRPC.TL_emojiList tL_emojiList = hs6.d0(i).N1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList t0 = hs6.d0(i).t0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (t0.isEmpty()) {
            ArrayList arrayList = hs6.d0(i).t0[1];
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
        vm vmVar = new vm(4, this.r, tL_emojiList.document_id.get(i).longValue());
        this.b = vmVar;
        vmVar.m = true;
        vmVar.u();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        bf0 bf0Var;
        j15 j15Var = this.e;
        if (j15Var != null) {
            j15Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        j15 j15Var2 = this.f;
        if (j15Var2 != null) {
            j15Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            float interpolation = d53.f.getInterpolation(f);
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
            this.d.setPivotY(bf0Var.getMeasuredHeight());
            if (this.x > 1.0f) {
                this.x = 1.0f;
                this.e = this.f;
                bf0 bf0Var2 = this.c;
                this.c = this.d;
                this.d = bf0Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public vm getAnimatedEmoji() {
        return this.a;
    }

    public hc0 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = mc0.d0[this.s];
        obj.c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm.d3(this.E, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.r(this.E);
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
