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
public final class rza extends FrameLayout implements tjb {
    public final TextView E;
    public final TextView F;
    public final ah8 G;
    public final ImageView H;
    public AnimatorSet I;
    public final byte a;
    public final px8 b;
    public final TextView c;
    public final be0 d;
    public final wf2 e;
    public boolean f;
    public final ImageView h;
    public final ImageView n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public final Rect w;
    public boolean x;
    public final FrameLayout y;

    public rza(Context context, int i) {
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
        int i11;
        this.w = new Rect();
        this.a = i;
        be0 be0Var = new be0(context);
        this.d = be0Var;
        be0Var.setAspectFit(true);
        be0Var.setLayerNum(1);
        boolean z = k96.a0;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i12 = i2 | 48;
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
        addView(be0Var, nme.d(40, 40.0f, i12, f, 9.0f, f2, 0.0f));
        if (i != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i != 3) {
                int i13 = bkb.Li;
                ff0 f0 = bkb.f0(bkb.w0(null, i13, false), 1, -1);
                vkb M = zkb.M(i13);
                imageView.setBackground(f0);
                zkb.j(imageView, f0, null, M, null);
            }
            if (i == 1) {
                int i14 = bkb.Ki;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                zkb.s(imageView, i14, null, mode);
                imageView.setImageResource(2131232046);
                imageView.setContentDescription(k96.M0(2131754838, null));
                if (k96.a0) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                addView(imageView, nme.e(40, 40, i11 | 16));
                ImageView imageView2 = new ImageView(context);
                this.n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(2131231631);
                zkb.s(imageView2, i14, null, mode);
                addView(imageView2, nme.h(58.0f, 58.0f, 8388613));
                wf2 wf2Var = new wf2(21, null, context);
                this.e = wf2Var;
                wf2Var.b(-1, bkb.c6, bkb.j7);
                wf2Var.setDrawUnchecked(false);
                wf2Var.setDrawBackgroundAsArc(3);
                addView(wf2Var, nme.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i == 3) {
                zkb.s(imageView, bkb.Ci, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131231198);
                boolean z2 = k96.a0;
                if (z2) {
                    i8 = 3;
                } else {
                    i8 = 5;
                }
                int i15 = i8 | 48;
                if (z2) {
                    i9 = 10;
                } else {
                    i9 = 0;
                }
                float f5 = i9;
                if (z2) {
                    i10 = 0;
                } else {
                    i10 = 10;
                }
                addView(imageView, nme.d(40, 40.0f, i15, f5, 9.0f, i10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131754483, null));
        zkb.X(textView, bkb.Ii, null);
        int i16 = bkb.Ei;
        int w0 = bkb.w0(null, i16, false);
        int i17 = bkb.Gi;
        ff0 d = sjb.d(w0, bkb.w0(null, i17, false), 14.0f);
        vkb M2 = zkb.M(i16);
        vkb M3 = zkb.M(i17);
        textView.setBackground(d);
        zkb.j(textView, d, M2, M3, null);
        textView.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new x00(this, (byte) 15));
        if (k96.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        frameLayout.addView(textView, nme.h(-2.0f, 28.0f, i3 | 16));
        ote.a(textView);
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        textView2.setText(k96.M0(2131744618, null));
        zkb.X(textView2, bkb.Hi, null);
        ff0 d2 = sjb.d(0, bkb.w0(null, i16, false) & 452984831, 14.0f);
        vkb g = zkb.g(i16, 26);
        textView2.setBackground(d2);
        zkb.j(textView2, d2, null, g, null);
        textView2.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new x00(this, (byte) 15));
        if (k96.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        frameLayout.addView(textView2, nme.i(-2.0f, 32.0f, i4 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        ote.a(textView2);
        ah8 ah8Var = new ah8(gl.L(4.0f), null, context, false);
        this.G = ah8Var;
        ah8Var.setIcon(2131624309);
        ah8Var.b(k96.M0(2131743637, null), new x00(this, (byte) 15), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ah8Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = gl.L(1.0f);
            marginLayoutParams.topMargin = gl.L(1.0f);
            int L = gl.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) ah8Var.getTextView().getLayoutParams()).leftMargin = gl.L(3.0f);
            ah8Var.getChildAt(0).setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.y;
        ah8 ah8Var2 = this.G;
        if (k96.a0) {
            i5 = 3;
        } else {
            i5 = 5;
        }
        frameLayout2.addView(ah8Var2, nme.h(-2.0f, 28.0f, i5 | 16));
        ote.a(this.G);
        this.y.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        View view = this.y;
        if (k96.a0) {
            i6 = 3;
        } else {
            i6 = 5;
        }
        addView(view, nme.d(-2, -1.0f, i6, 0.0f, 0.0f, 0.0f, 0.0f));
        this.y.setOnClickListener(new bna(this, (byte) 10));
        px8 px8Var = new px8(context, (byte) 4);
        this.b = px8Var;
        kk7.i(px8Var);
        zkb.X(px8Var, bkb.F6, null);
        px8Var.setTextSize(1, 16.0f);
        px8Var.setTypeface(gl.o());
        px8Var.setLines(1);
        px8Var.setMaxLines(1);
        px8Var.setSingleLine(true);
        px8Var.setEllipsize(TextUtils.TruncateAt.END);
        px8Var.setGravity(nme.y());
        addView(px8Var, nme.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        zkb.X(textView3, bkb.y6, null);
        ug8.w(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(nme.y());
        addView(textView3, nme.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i == 3) {
            ImageView imageView3 = new ImageView(context);
            this.H = imageView3;
            imageView3.setImageResource(2131232101);
            imageView3.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
            zkb.s(imageView3, bkb.x6, null, PorterDuff.Mode.SRC_IN);
            int i18 = bkb.h6;
            ff0 f02 = bkb.f0(bkb.w0(null, i18, false), 1, -1);
            vkb M4 = zkb.M(i18);
            imageView3.setBackground(f02);
            zkb.j(imageView3, f02, null, M4, null);
            imageView3.setVisibility(8);
            boolean z3 = k96.a0;
            if (z3) {
                i7 = 3;
            } else {
                i7 = 5;
            }
            int i19 = i7 | 16;
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
            addView(imageView3, nme.d(-2, -2.0f, i19, f3, 0.0f, f4, 0.0f));
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
        hashSet.add(Integer.valueOf(bkb.l6));
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
                ViewPropertyAnimator listener = imageView.animate().setListener(new pza(this, z, (byte) 0));
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
                ViewPropertyAnimator listener2 = frameLayout.animate().setListener(new pza(this, z, (byte) 1));
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
            s33 s33Var = ls3.a;
            duration.setInterpolator(s33Var).withEndAction(new Runnable(this) {
                public final rza b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z2 = z;
                    rza rzaVar = this.b;
                    switch (b) {
                        case 0:
                            if (!z2) {
                                rzaVar.n.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (z2) {
                                rzaVar.y.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (z2) {
                                rzaVar.h.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            if (this.x) {
                FrameLayout frameLayout = this.y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(s33Var).withEndAction(new Runnable(this) {
                    public final rza b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        boolean z2 = z;
                        rza rzaVar = this.b;
                        switch (b) {
                            case 0:
                                if (!z2) {
                                    rzaVar.n.setVisibility(8);
                                    return;
                                }
                                return;
                            case 1:
                                if (z2) {
                                    rzaVar.y.setVisibility(8);
                                    return;
                                }
                                return;
                            default:
                                if (z2) {
                                    rzaVar.h.setVisibility(8);
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
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(s33Var).withEndAction(new Runnable(this) {
                public final rza b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z2 = z;
                    rza rzaVar = this.b;
                    switch (b) {
                        case 0:
                            if (!z2) {
                                rzaVar.n.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (z2) {
                                rzaVar.y.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (z2) {
                                rzaVar.h.setVisibility(8);
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
        gl5 k;
        int i2;
        String str2;
        this.f = z;
        this.r = tL_messages_stickerSet;
        this.s = z2;
        be0 be0Var = this.d;
        be0Var.setVisibility(0);
        px8 px8Var = this.b;
        px8Var.setTranslationY(0.0f);
        px8Var.setText(this.r.set.title);
        boolean z3 = this.r.set.archived;
        TextView textView = this.c;
        if (z3) {
            px8Var.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            be0Var.setAlpha(0.5f);
        } else {
            px8Var.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            be0Var.setAlpha(1.0f);
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
        be0Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.x) {
                str3 = "EmojiCount";
            }
            textView.setText(k96.G(arrayList.size(), str3, new Object[0]));
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
            e66.e(1);
            TLObject w = ba4.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w == null) {
                w = document2;
            }
            kcb d = uo3.d(tL_messages_stickerSet.set.thumbs, bkb.Z6, 1.0f, false);
            boolean z5 = w instanceof TLRPC.Document;
            if (z5) {
                k = gl5.c(ba4.w(document2.thumbs, 90, false, null, false), document2);
            } else {
                k = gl5.k((TLRPC.PhotoSize) w, document2, tL_messages_stickerSet.set.thumb_version);
            }
            gl5 gl5Var = k;
            if (this.x) {
                i2 = 16388;
            } else {
                i2 = 1;
            }
            if (!e66.e(i2)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (z5 && (k27.K2(document2, true) || k27.M4(document2))) {
                if (d != null) {
                    be0Var.p(gl5.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    be0Var.h(gl5.b(document2), concat, gl5Var, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (k27.B4(document2)) {
                    be0Var.setColorFilter(bkb.u3);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (gl5Var != null && gl5Var.p == 1) {
                    be0Var.n(gl5Var, concat, "tgs", d, tL_messages_stickerSet2);
                } else {
                    be0Var.n(gl5Var, concat, "webp", d, tL_messages_stickerSet2);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(k96.G(0, str3, new Object[0]));
            be0Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                vl.g(y6c.t0).b(tL_messages_stickerSet2.set.thumb_document_id, new a27(this, (byte) 2));
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
        ah8 ah8Var = this.G;
        if (i == 1) {
            ah8Var.b(k96.M0(2131743637, null), new x00(this, (byte) 15), false);
        } else if (i == 2) {
            ah8Var.b(k96.M0(2131745889, null), new x00(this, (byte) 15), false);
        }
        if (i != 1 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        ah8Var.setEnabled(z);
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
        ah8Var.setAlpha(f);
        if (i != 1 && i != 2) {
            f2 = 0.6f;
        } else {
            f2 = 1.0f;
        }
        ah8Var.setScaleX(f2);
        if (i != 1 && i != 2) {
            f3 = 0.6f;
        } else {
            f3 = 1.0f;
        }
        ah8Var.setScaleY(f3);
        if (i != 1 && i != 2) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        ah8Var.setVisibility(i2);
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
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.L(58.0f), 1073741824);
        FrameLayout frameLayout = this.y;
        frameLayout.measure(-2146483649, makeMeasureSpec);
        int measuredWidth = frameLayout.getMeasuredWidth() + gl.L(26.0f);
        boolean z4 = k96.a0;
        TextView textView3 = this.c;
        px8 px8Var = this.b;
        if (z4) {
            ((ViewGroup.MarginLayoutParams) px8Var.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) px8Var.getLayoutParams()).rightMargin = measuredWidth;
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
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(71.0f);
            }
            float f = L;
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (k96.a0) {
                i = gl.L(71.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, height, width - i, getHeight() - 1, bkb.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wf2 wf2Var = this.e;
        if (wf2Var != null && wf2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(58.0f) + (this.f ? 1 : 0), 1073741824));
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
