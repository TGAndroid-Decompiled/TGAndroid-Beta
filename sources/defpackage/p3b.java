package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p3b extends FrameLayout implements snb {
    public final TextView E;
    public final TextView F;
    public final ok8 G;
    public final ImageView H;
    public AnimatorSet I;
    public final byte a;
    public final c19 b;
    public final TextView c;
    public final de0 d;
    public final og2 e;
    public boolean f;
    public final ImageView h;
    public final ImageView n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public final Rect w;
    public boolean x;
    public final FrameLayout y;

    public p3b(Context context, int i) {
        super(context);
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f3;
        float f4;
        int i8;
        int i9;
        int i10;
        this.w = new Rect();
        this.a = i;
        de0 de0Var = new de0(context);
        this.d = de0Var;
        de0Var.setAspectFit(true);
        de0Var.setLayerNum(1);
        boolean z = ob6.a0;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i11 = i2 | 48;
        if (z) {
            f = 0.0f;
        } else {
            f = 13.0f;
        }
        if (z) {
            f2 = 13.0f;
        } else {
            f2 = 0.0f;
        }
        addView(de0Var, tre.d(40, 40.0f, i11, f, 9.0f, f2, 0.0f));
        if (i != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i != 3) {
                int i12 = aob.Mi;
                hf0 f0 = aob.f0(aob.w0(null, i12, false), 1, -1);
                uob M = yob.M(i12);
                imageView.setBackground(f0);
                yob.j(imageView, f0, null, M, null);
            }
            if (i == 1) {
                int i13 = aob.Li;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                yob.s(imageView, i13, null, mode);
                imageView.setImageResource(2131232046);
                imageView.setContentDescription(ob6.M0(2131754834, null));
                if (ob6.a0) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                addView(imageView, tre.e(40, 40, i10 | 16));
                ImageView imageView2 = new ImageView(context);
                this.n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(2131231631);
                yob.s(imageView2, i13, null, mode);
                addView(imageView2, tre.h(58.0f, 58.0f, 8388613));
                og2 og2Var = new og2(21, null, context);
                this.e = og2Var;
                og2Var.b(-1, aob.d6, aob.k7);
                og2Var.setDrawUnchecked(false);
                og2Var.setDrawBackgroundAsArc(3);
                addView(og2Var, tre.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i == 3) {
                yob.s(imageView, aob.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131231198);
                boolean z2 = ob6.a0;
                if (z2) {
                    i8 = 3;
                } else {
                    i8 = 5;
                }
                int i14 = i8 | 48;
                if (z2) {
                    i9 = 10;
                } else {
                    i9 = 0;
                }
                addView(imageView, tre.d(40, 40.0f, i14, i9, 9.0f, z2 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131754479, null));
        yob.X(textView, aob.Ji, null);
        int i15 = aob.Fi;
        int w0 = aob.w0(null, i15, false);
        int i16 = aob.Hi;
        hf0 d = rnb.d(w0, aob.w0(null, i16, false), 14.0f);
        uob M2 = yob.M(i15);
        uob M3 = yob.M(i16);
        textView.setBackground(d);
        yob.j(textView, d, M2, M3, null);
        textView.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new y00(this, (byte) 15));
        if (ob6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        frameLayout.addView(textView, tre.h(-2.0f, 28.0f, i3 | 16));
        iye.a(textView);
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        textView2.setText(ob6.M0(2131744512, null));
        yob.X(textView2, aob.Ii, null);
        hf0 d2 = rnb.d(0, aob.w0(null, i15, false) & 452984831, 14.0f);
        uob g = yob.g(i15, 26);
        textView2.setBackground(d2);
        yob.j(textView2, d2, null, g, null);
        textView2.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new y00(this, (byte) 15));
        if (ob6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        frameLayout.addView(textView2, tre.i(-2.0f, 32.0f, i4 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        iye.a(textView2);
        ok8 ok8Var = new ok8(hl.L(4.0f), null, context, false);
        this.G = ok8Var;
        ok8Var.setIcon(2131624310);
        ok8Var.b(ob6.M0(2131743531, null), new y00(this, (byte) 15), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ok8Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = hl.L(1.0f);
            marginLayoutParams.topMargin = hl.L(1.0f);
            int L = hl.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) ok8Var.getTextView().getLayoutParams()).leftMargin = hl.L(3.0f);
            ok8Var.getChildAt(0).setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.y;
        ok8 ok8Var2 = this.G;
        if (ob6.a0) {
            i5 = 3;
        } else {
            i5 = 5;
        }
        frameLayout2.addView(ok8Var2, tre.h(-2.0f, 28.0f, i5 | 16));
        iye.a(this.G);
        this.y.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        View view = this.y;
        if (ob6.a0) {
            i6 = 3;
        } else {
            i6 = 5;
        }
        addView(view, tre.d(-2, -1.0f, i6, 0.0f, 0.0f, 0.0f, 0.0f));
        this.y.setOnClickListener(new kla(this, (byte) 11));
        c19 c19Var = new c19(context, (byte) 4);
        this.b = c19Var;
        jn7.i(c19Var);
        yob.X(c19Var, aob.G6, null);
        c19Var.setTextSize(1, 16.0f);
        c19Var.setTypeface(hl.o());
        c19Var.setLines(1);
        c19Var.setMaxLines(1);
        c19Var.setSingleLine(true);
        c19Var.setEllipsize(TextUtils.TruncateAt.END);
        c19Var.setGravity(tre.y());
        addView(c19Var, tre.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        yob.X(textView3, aob.z6, null);
        ik8.w(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(tre.y());
        addView(textView3, tre.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i == 3) {
            ImageView imageView3 = new ImageView(context);
            this.H = imageView3;
            imageView3.setImageResource(2131232101);
            imageView3.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
            yob.s(imageView3, aob.y6, null, PorterDuff.Mode.SRC_IN);
            int i17 = aob.i6;
            hf0 f02 = aob.f0(aob.w0(null, i17, false), 1, -1);
            uob M4 = yob.M(i17);
            imageView3.setBackground(f02);
            yob.j(imageView3, f02, null, M4, null);
            imageView3.setVisibility(8);
            boolean z3 = ob6.a0;
            if (z3) {
                i7 = 3;
            } else {
                i7 = 5;
            }
            int i18 = i7 | 16;
            if (z3) {
                f3 = 4.0f;
            } else {
                f3 = 0.0f;
            }
            if (z3) {
                f4 = 0.0f;
            } else {
                f4 = 4.0f;
            }
            addView(imageView3, tre.d(-2, -2.0f, i18, f3, 0.0f, f4, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        byte b = this.a;
        if (b == 1) {
            return this.e.a.q;
        }
        if (b == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.x || this.y.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.m6));
    }

    public final void b(boolean z, boolean z2) {
        float f;
        float f2;
        byte b = this.a;
        if (b == 1) {
            this.e.a(z, z2);
            return;
        }
        int i = 4;
        float f3 = 0.0f;
        float f4 = 0.1f;
        if (b == 3) {
            ImageView imageView = this.h;
            if (z2) {
                imageView.animate().cancel();
                ViewPropertyAnimator listener = imageView.animate().setListener(new n3b(this, z, (byte) 0));
                if (z) {
                    f3 = 1.0f;
                }
                ViewPropertyAnimator alpha = listener.alpha(f3);
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.1f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f2);
                if (z) {
                    f4 = 1.0f;
                }
                scaleX.scaleY(f4).setDuration(150L).start();
                return;
            }
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
            if (!z) {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else if (this.x) {
            FrameLayout frameLayout = this.y;
            if (z2) {
                frameLayout.animate().cancel();
                ViewPropertyAnimator listener2 = frameLayout.animate().setListener(new n3b(this, z, (byte) 1));
                if (z) {
                    f3 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = listener2.alpha(f3);
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.1f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f);
                if (z) {
                    f4 = 1.0f;
                }
                scaleX2.scaleY(f4).setDuration(150L).start();
                return;
            }
            if (z) {
                i = 0;
            }
            frameLayout.setVisibility(i);
            if (!z) {
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleX(0.1f);
                frameLayout.setScaleY(0.1f);
                return;
            }
            frameLayout.setAlpha(1.0f);
            frameLayout.setScaleX(1.0f);
            frameLayout.setScaleY(1.0f);
        }
    }

    public final void c(final boolean z) {
        float f;
        if (this.a == 1) {
            float f2 = 0.0f;
            float f3 = 1.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            float[] fArr = {f, f2};
            float f4 = 0.66f;
            if (z) {
                f3 = 0.66f;
                f4 = 1.0f;
            }
            float[] fArr2 = {f4, f3};
            ImageView imageView = this.n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            k43 k43Var = dt3.a;
            duration.setInterpolator(k43Var).withEndAction(new Runnable(this) {
                public final p3b b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z2 = z;
                    p3b p3bVar = this.b;
                    switch (b) {
                        case 0:
                            if (!z2) {
                                p3bVar.n.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (z2) {
                                p3bVar.y.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (z2) {
                                p3bVar.h.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            if (this.x) {
                FrameLayout frameLayout = this.y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(k43Var).withEndAction(new Runnable(this) {
                    public final p3b b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        boolean z2 = z;
                        p3b p3bVar = this.b;
                        switch (b) {
                            case 0:
                                if (!z2) {
                                    p3bVar.n.setVisibility(8);
                                    return;
                                }
                                return;
                            case 1:
                                if (z2) {
                                    p3bVar.y.setVisibility(8);
                                    return;
                                }
                                return;
                            default:
                                if (z2) {
                                    p3bVar.h.setVisibility(8);
                                    return;
                                }
                                return;
                        }
                    }
                }).start();
                return;
            }
            ImageView imageView2 = this.h;
            imageView2.setVisibility(0);
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(k43Var).withEndAction(new Runnable(this) {
                public final p3b b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z2 = z;
                    p3b p3bVar = this.b;
                    switch (b) {
                        case 0:
                            if (!z2) {
                                p3bVar.n.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (z2) {
                                p3bVar.y.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (z2) {
                                p3bVar.h.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z, boolean z2) {
        int i;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        String str;
        TLRPC.Document document;
        jn5 k;
        int i2;
        String str2;
        this.f = z;
        this.r = tL_messages_stickerSet;
        this.s = z2;
        de0 de0Var = this.d;
        de0Var.setVisibility(0);
        c19 c19Var = this.b;
        c19Var.setTranslationY(0.0f);
        c19Var.setText(this.r.set.title);
        boolean z3 = this.r.set.archived;
        TextView textView = this.c;
        if (z3) {
            c19Var.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            de0Var.setAlpha(0.5f);
        } else {
            c19Var.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            de0Var.setAlpha(1.0f);
        }
        boolean z4 = tL_messages_stickerSet.set.emojis;
        this.x = z4;
        int i3 = 8;
        if (z4) {
            i = 0;
        } else {
            i = 8;
        }
        this.y.setVisibility(i);
        if (!this.x) {
            i3 = 0;
        }
        this.h.setVisibility(i3);
        de0Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.x) {
                str3 = "EmojiCount";
            }
            textView.setText(ob6.G(arrayList.size(), str3, new Object[0]));
            int i4 = 0;
            while (true) {
                if (i4 < arrayList.size()) {
                    document = arrayList.get(i4);
                    if (document != null && document.id == tL_messages_stickerSet.set.thumb_document_id) {
                        break;
                    }
                    i4++;
                } else {
                    document = null;
                    break;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            TLRPC.Document document2 = document;
            i86.e(1);
            TLObject w = xb4.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w == null) {
                w = document2;
            }
            ggb d = lp3.d(tL_messages_stickerSet.set.thumbs, aob.a7, 1.0f, false);
            boolean z5 = w instanceof TLRPC.Document;
            if (z5) {
                k = jn5.c(xb4.w(document2.thumbs, 90, false, null, false), document2);
            } else {
                k = jn5.k((TLRPC.PhotoSize) w, document2, tL_messages_stickerSet.set.thumb_version);
            }
            jn5 jn5Var = k;
            if (this.x) {
                i2 = 16388;
            } else {
                i2 = 1;
            }
            if (!i86.e(i2)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (z5 && (r47.K2(document2, true) || r47.M4(document2))) {
                if (d != null) {
                    de0Var.p(jn5.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    de0Var.h(jn5.b(document2), concat, jn5Var, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (r47.B4(document2)) {
                    de0Var.setColorFilter(aob.v3);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (jn5Var != null && jn5Var.p == 1) {
                    de0Var.n(jn5Var, concat, "tgs", d, tL_messages_stickerSet2);
                } else {
                    de0Var.n(jn5Var, concat, "webp", d, tL_messages_stickerSet2);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(ob6.G(0, str3, new Object[0]));
            de0Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                wl.g(yac.t0).b(tL_messages_stickerSet2.set.thumb_document_id, new h47(this, (byte) 2));
            }
        }
        if (this.s) {
            if (tL_messages_stickerSet2.set.emojis) {
                str = "t.me/addemoji/";
            } else {
                str = "t.me/addstickers/";
            }
            textView.setText(str + tL_messages_stickerSet2.set.short_name);
        }
    }

    public final void e(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        float f3;
        int i2;
        float f4;
        float f5;
        float f6;
        int i3;
        float f7;
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I = null;
        }
        int i4 = 0;
        ok8 ok8Var = this.G;
        if (i == 1) {
            ok8Var.b(ob6.M0(2131743531, null), new y00(this, (byte) 15), false);
        } else if (i == 2) {
            ok8Var.b(ob6.M0(2131745809, null), new y00(this, (byte) 15), false);
        }
        if (i != 1 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        ok8Var.setEnabled(z);
        if (i == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        TextView textView = this.E;
        textView.setEnabled(z2);
        if (i == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        TextView textView2 = this.F;
        textView2.setEnabled(z3);
        float f8 = 0.0f;
        float f9 = 1.0f;
        if (i != 1 && i != 2) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        ok8Var.setAlpha(f);
        if (i != 1 && i != 2) {
            f2 = 0.6f;
        } else {
            f2 = 1.0f;
        }
        ok8Var.setScaleX(f2);
        if (i != 1 && i != 2) {
            f3 = 0.6f;
        } else {
            f3 = 1.0f;
        }
        ok8Var.setScaleY(f3);
        if (i != 1 && i != 2) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        ok8Var.setVisibility(i2);
        if (i == 3) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        textView.setAlpha(f4);
        if (i == 3) {
            f5 = 1.0f;
        } else {
            f5 = 0.6f;
        }
        textView.setScaleX(f5);
        if (i == 3) {
            f6 = 1.0f;
        } else {
            f6 = 0.6f;
        }
        textView.setScaleY(f6);
        if (i == 3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        if (i == 4) {
            f8 = 1.0f;
        }
        textView2.setAlpha(f8);
        if (i == 4) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        textView2.setScaleX(f7);
        if (i != 4) {
            f9 = 0.6f;
        }
        textView2.setScaleY(f9);
        if (i != 4) {
            i4 = 8;
        }
        textView2.setVisibility(i4);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hl.L(58.0f), 1073741824);
        FrameLayout frameLayout = this.y;
        frameLayout.measure(-2146483649, makeMeasureSpec);
        int measuredWidth = frameLayout.getMeasuredWidth() + hl.L(26.0f);
        boolean z4 = ob6.a0;
        TextView textView3 = this.c;
        c19 c19Var = this.b;
        if (z4) {
            ((ViewGroup.MarginLayoutParams) c19Var.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) c19Var.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.f) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(71.0f);
            }
            float f = L;
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (ob6.a0) {
                i = hl.L(71.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, height, width - i, getHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        og2 og2Var = this.e;
        if (og2Var != null && og2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(58.0f) + (this.f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.w;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.x && (frameLayout = this.y) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z) {
        b(z, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        int i;
        ImageView imageView = this.H;
        if (imageView != null) {
            if (onClickListener == null) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z) {
        this.f = z;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z) {
        c(z);
    }

    @Override
    public final void updateColors() {
    }
}
