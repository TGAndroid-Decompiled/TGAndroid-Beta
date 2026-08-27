package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.ou0;
import org.telegram.ui.sy;

public final class j3 extends t {
    public final org.telegram.ui.Components.y5 d;

    public final org.telegram.ui.Components.y5 f13525e;

    public final org.telegram.ui.Components.voip.h f13526f;
    public final org.telegram.ui.Components.y5 h;

    public final org.telegram.ui.Components.y5 f13527n;

    public boolean f13528r;

    public boolean f13529s;
    public final b4 v;

    public final i9 f13530w;

    public final e4 f13531x;

    public j3(e4 e4Var, Context context, b4 b4Var, i9 i9Var) {
        super(context);
        this.f13531x = e4Var;
        this.v = b4Var;
        this.f13530w = i9Var;
        er erVar = er.f28122f;
        this.d = new org.telegram.ui.Components.y5(this, 150L, erVar);
        this.f13525e = new org.telegram.ui.Components.y5(this, 150L, erVar);
        this.f13526f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(this);
        this.h = y5Var;
        org.telegram.ui.Components.y5 y5Var2 = new org.telegram.ui.Components.y5(this);
        this.f13527n = y5Var2;
        y5Var.f34815g = 500L;
        y5Var2.f34815g = 100L;
    }

    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        j6 j6Var;
        TL_stories.StoryItem storyItem2;
        int i10;
        TLRPC.UserFull userFull;
        float fClamp;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int iDp;
        float f15;
        int i11;
        float f16;
        Paint paint;
        int i12;
        h9 h9Var;
        h9 h9Var2;
        e4 e4Var = this.f13531x;
        float f17 = e4Var.E1;
        f3 f3Var = e4Var.f13232f1;
        d4 d4Var = e4Var.I2;
        c4 c4Var = e4Var.K1;
        y2 y2Var = e4Var.f13219a1;
        if (y2Var.hasNotThumb() || ((c4Var.f13144e && d4Var.f13195f) || (c4Var.f13145f && d4Var.f13195f))) {
            e4 e4Var2 = c4Var.f13149k;
            TL_stories.PeerStories peerStoriesY = e4Var2.f13264q1;
            i9 i9Var = e4Var2.F0;
            if (peerStoriesY == null && (peerStoriesY = e4Var2.O1.y(e4Var2.f13291x1)) == null && (userFull = MessagesController.getInstance(e4Var2.f13296y2).getUserFull(e4Var2.f13291x1)) != null) {
                peerStoriesY = userFull.stories;
            }
            if (e4Var2.G1 && (storyItem2 = c4Var.f13141a) != null && peerStoriesY != null && ((!l7.v(storyItem2) && ((i10 = c4Var.f13141a.f22617id) > peerStoriesY.max_read_id || i10 > e4Var2.O1.f13959f.get(e4Var2.f13291x1, 0))) || e4Var2.f13295y1)) {
                TL_stories.PeerStories peerStories = i9Var.M0;
                if (peerStories == null) {
                    s6 s6Var = e4Var2.O1;
                    long j10 = e4Var2.f13291x1;
                    TL_stories.StoryItem storyItem3 = c4Var.f13141a;
                    TL_stories.PeerStories peerStoriesY2 = s6Var.y(j10);
                    if (peerStoriesY2 == null) {
                        peerStoriesY2 = s6Var.z(j10);
                    }
                    if (s6Var.V(peerStoriesY2, storyItem3, false)) {
                        i9Var.Y0 = true;
                    }
                } else if (e4Var2.O1.V(peerStories, c4Var.f13141a, true)) {
                    i9Var.Y0 = true;
                }
            } else if (e4Var2.G1 && (storyItem = c4Var.f13141a) != null && (j6Var = i9Var.K0) != null && j6Var.r(storyItem.f22617id)) {
                i9Var.Y0 = true;
            }
        }
        float hideInterfaceAlpha = e4Var.getHideInterfaceAlpha();
        if (c4Var.f13144e) {
            h9 h9Var3 = d4Var.f13192b;
            if (h9Var3 != null) {
                fClamp = Utilities.clamp(h9Var3.getPlaybackProgress(e4Var.N2), 1.0f, 0.0f);
                if (d4Var.f13195f && f3Var != null) {
                    f3Var.e();
                }
            } else {
                fClamp = 0.0f;
            }
            invalidate();
        } else if (e4Var.N1 || !e4Var.G1 || e4Var.P1 || e4Var.Q1 || e4Var.R1 || !y2Var.hasNotThumb()) {
            fClamp = Utilities.clamp(e4Var.S0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = e4Var.T0;
            if (j11 != 0 && !e4Var.f13234f3) {
                if (e4Var.S0 <= 0 && jCurrentTimeMillis - j11 > 0 && f3Var != null) {
                    f3Var.e();
                }
                e4Var.S0 += jCurrentTimeMillis - e4Var.T0;
            }
            e4Var.T0 = jCurrentTimeMillis;
            fClamp = Utilities.clamp(e4Var.S0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (d4Var == null || (h9Var2 = d4Var.f13192b) == null) {
            f10 = fClamp;
        } else {
            f10 = h9Var2.currentSeek;
            if (f10 < 0.0f) {
                f10 = fClamp;
            }
        }
        if (!e4Var.U0 && fClamp == 1.0f && ((!c4Var.f13144e || !e4Var.f13234f3) && !e4Var.H2)) {
            e4Var.U0 = true;
            post(new y9(this, 12));
        }
        i9 i9Var2 = this.f13530w;
        j6 j6Var2 = i9Var2.K0;
        if (j6Var2 == null || j6Var2.f13537e == 3) {
            f11 = 4.0f;
            f12 = 1.0f;
            f13 = 2.0f;
            f14 = 8.0f;
        } else {
            if (e4Var.f13252m1 == null) {
                e4Var.f13252m1 = new u5.k();
            }
            u5.k kVar = e4Var.f13252m1;
            f11 = 4.0f;
            float f18 = (1.0f - e4Var.Z3) * hideInterfaceAlpha * f17;
            int i13 = e4Var.H1;
            f12 = 1.0f;
            int iG = i9Var2.K0.g();
            f13 = 2.0f;
            a4 a4Var = e4Var.f13247k1;
            f14 = 8.0f;
            org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) kVar.d;
            int i14 = (iG << 12) + i13;
            if (kVar.f48421a != i14) {
                kVar.f48421a = i14;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i13 + 1)).append((CharSequence) kVar.f48422b).append((CharSequence) "/").append((CharSequence) kVar.f48423c).append((CharSequence) String.valueOf(iG));
                i6Var.q(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y10 = a4Var.getY();
            eg.c cVar = a4Var.f13034b;
            float top = ((i6Var.f29241e / 2.0f) + (y10 + cVar.getTop())) - 1.0f;
            int iD = (int) i6Var.d();
            cVar.setRightPadding(iD);
            canvas.translate((cVar.getRightDrawableWidth() + (cVar.getTextWidth() + (cVar.getLeft() + (a4Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((cVar.getRightDrawableWidth() + cVar.getTextWidth()) + iD) - cVar.getWidth(), iD, 0), top);
            float fDp = AndroidUtilities.dp(8.0f);
            float fDp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-fDp, -fDp2, i6Var.d() + fDp, i6Var.f29241e + fDp2);
            i6Var.f29257w = (int) (f18 * 160.0f);
            i6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f14) - (AndroidUtilities.dp(f14) * e4Var.Z3));
        boolean z10 = c4Var.f13144e && (h9Var = d4Var.f13192b) != null && h9Var.isBuffering();
        boolean z11 = e4Var.H2;
        boolean z12 = z11 && c4Var != null && c4Var.f13144e && i9Var2.f13481g0;
        float fE = e4Var.L2.e(!z11 || z12);
        h8 h8Var = e4Var.l1;
        int measuredWidth = getMeasuredWidth();
        int i15 = e4Var.I1;
        int i16 = e4Var.J1;
        float f19 = (f12 - e4Var.Z3) * f17;
        TextPaint textPaint = h8Var.f13416c;
        if (i16 > 0) {
            boolean z13 = z10 && !z12;
            if (h8Var.f13420i != i15) {
                h8Var.f13419g = 0.0f;
                h8Var.h = true;
            }
            h8Var.f13420i = i15;
            b4 b4Var = h8Var.f13414a;
            Paint paint2 = b4Var.f13082a;
            Paint paint3 = b4Var.f13083b;
            if (i16 > 100) {
                iDp = 1;
            } else {
                iDp = i16 >= 50 ? AndroidUtilities.dp(f12) : AndroidUtilities.dp(f13);
            }
            float fDp3 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i16 - 1) * iDp)) / i16;
            AndroidUtilities.dp(5.0f);
            float fMin = Math.min(fDp3 / f13, AndroidUtilities.dp(f12));
            float fE2 = h8Var.f13415b.e(z12);
            if (fE2 > 0.0f) {
                float fLerp = AndroidUtilities.lerp(fClamp, f10, fE2);
                canvas.save();
                textPaint.setAlpha((int) (fE2 * 255.0f));
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f12), org.telegram.ui.ActionBar.g6.l1(fE2, 805306368));
                canvas.translate(((measuredWidth - h8Var.f13418f) / f13) - h8Var.f13417e, AndroidUtilities.lerp(AndroidUtilities.dp(f11), AndroidUtilities.dp(16.0f), fE2));
                h8Var.d.draw(canvas);
                canvas.restore();
                fClamp = fLerp;
            }
            int i17 = 0;
            while (i17 < i16) {
                float fDp4 = (i17 * fDp3) + AndroidUtilities.dp(5.0f) + (-0.0f) + (iDp * i17);
                if (fDp4 <= measuredWidth) {
                    float f20 = fDp4 + fDp3;
                    if (f20 < 0.0f || f19 <= 0.0f) {
                        fMin = fMin;
                        h8Var = h8Var;
                        f15 = fClamp;
                        i11 = measuredWidth;
                    } else {
                        float fLerp2 = AndroidUtilities.lerp(fMin, AndroidUtilities.dpf2(f13), fE2);
                        if (i17 > i15 || i17 != i15) {
                            h8Var = h8Var;
                            f15 = fClamp;
                            i11 = measuredWidth;
                            f16 = 1.0f;
                        } else {
                            RectF rectF = AndroidUtilities.rectTmp;
                            f15 = fClamp;
                            i11 = measuredWidth;
                            rectF.set(fDp4, 0.0f, f20, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i15 == i17 ? 1 : 0) * fE2));
                            if (z13) {
                                if (h8Var.h) {
                                    float f21 = h8Var.f13419g + 0.026666667f;
                                    h8Var.f13419g = f21;
                                    if (f21 > 0.5f) {
                                        h8Var.h = false;
                                    }
                                } else {
                                    float f22 = h8Var.f13419g - 0.026666667f;
                                    h8Var.f13419g = f22;
                                    if (f22 < -0.5f) {
                                        h8Var.h = true;
                                    }
                                }
                                i12 = (int) (h8Var.f13419g * 51.0f * f19 * fE);
                            } else {
                                i12 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f19 * fE)) + i12);
                            if (fE2 > 0.0f) {
                                int i18 = i17 - i15;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i18 * i11), fE2), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i18 + 1) * i11) - AndroidUtilities.dp(5.0f), fE2), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            }
                            canvas.drawRoundRect(rectF, r30, r30, paint2);
                            f16 = f15;
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(fDp4, 0.0f, f20, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i15 == i17 ? 1 : 0) * fE2));
                        if (fE2 > 0.0f) {
                            int i19 = i17 - i15;
                            rectF2.left = Utilities.clamp(AndroidUtilities.lerp(rectF2.left, AndroidUtilities.dp(5.0f) + (i19 * i11), fE2), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            rectF2.right = Utilities.clamp(AndroidUtilities.lerp(rectF2.right, ((i19 + 1) * i11) - AndroidUtilities.dp(5.0f), fE2), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                        }
                        rectF2.right = AndroidUtilities.lerp(rectF2.left, rectF2.right, f16);
                        if (i17 <= i15) {
                            paint3.setAlpha((int) (f19 * 255.0f * fE));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85 * f19 * fE));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, fLerp2, fLerp2, paint);
                    }
                } else {
                    fMin = fMin;
                    h8Var = h8Var;
                    f15 = fClamp;
                    i11 = measuredWidth;
                }
                i17++;
                fMin = fMin;
                i16 = i16;
                fClamp = f15;
                measuredWidth = i11;
                h8Var = h8Var;
            }
        }
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        b4 b4Var;
        ?? r15;
        float f11;
        float f12;
        float f13;
        h4 h4Var;
        boolean z10;
        float f14;
        boolean z11;
        org.telegram.ui.Components.y5 y5Var;
        org.telegram.ui.Components.y5 y5Var2;
        boolean zHasNotThumb;
        h9 h9Var;
        float f15;
        float f16;
        d1 d1Var;
        og.d dVar;
        h9 h9Var2;
        k8 k8Var;
        Canvas canvas2 = canvas;
        e4 e4Var = this.f13531x;
        j3 j3Var = e4Var.Y0;
        f3 f3Var = e4Var.f13232f1;
        c4 c4Var = e4Var.K1;
        y2 y2Var = e4Var.f13219a1;
        d4 d4Var = e4Var.I2;
        n3 n3Var = e4Var.G0;
        if (!e4Var.G1) {
            e4Var.f13247k1.f13033a.getImageReceiver().setVisible(true, true);
        }
        boolean z12 = e4Var.Y2;
        b4 b4Var2 = this.v;
        if (z12) {
            f10 = 1.0f;
            canvas2.drawColor(i0.b.d(0.2f, -16777216, -1));
        } else {
            f10 = 1.0f;
            if (d4Var.d != null || (f3Var != null && (((k8Var = f3Var.f13659b) != null && (k8Var.f13600w || k8Var.f13599s)) || f3Var.f13668y.f34816i))) {
                invalidate();
            }
            canvas2.save();
            ou0 ou0Var = e4Var.T2;
            if (ou0Var.f41180n) {
                canvas2.save();
                float f17 = ou0Var.O;
                float f18 = ou0Var.A;
                float f19 = ((f17 * f18) + 1.0f) - f18;
                canvas2.scale(f19, f19, ou0Var.f41181o + ou0Var.f41185s, ou0Var.f41182p + ou0Var.f41186t);
                float f20 = ou0Var.f41181o;
                float f21 = ou0Var.J;
                float f22 = ou0Var.A;
                canvas2.translate((f21 * f22) + f20, (ou0Var.K * f22) + ou0Var.f41182p);
            }
            c5.c cVar = d4Var.d;
            if (cVar == null || (!d4Var.f13195f && d4Var.f13191a == null)) {
                if (cVar != null) {
                    invalidate();
                }
                if (c4Var.d) {
                    canvas2.drawColor(i0.b.d(0.2f, -16777216, -1));
                } else {
                    if (!y2Var.hasBitmapImage()) {
                        b4Var2.f13086f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        b4Var2.f13086f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    y2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    y2Var.draw(canvas2);
                }
                canvas2.restore();
                z11 = e4Var.U2;
                y5Var = this.h;
                y5Var2 = this.f13527n;
                if (z11) {
                    y5Var.d(f14, true);
                    y5Var2.d(f14, true);
                }
                if (c4Var.f13145f) {
                    d1Var = d4Var.f13191a;
                    if (d1Var == null && (d4Var.f13195f || d1Var.n())) {
                        zHasNotThumb = true;
                    } else {
                        zHasNotThumb = false;
                    }
                } else if (!c4Var.f13144e) {
                    zHasNotThumb = y2Var.hasNotThumb();
                } else if (d4Var.d != null || (h9Var = d4Var.f13192b) == null || !d4Var.f13195f || (h9Var.progress == 0.0f && h9Var != null && h9Var.isBuffering() && !d4Var.f13192b.paused)) {
                    zHasNotThumb = false;
                } else {
                    zHasNotThumb = true;
                }
                if (e4Var.G1 || zHasNotThumb || c4Var.f13142b != null) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                y5Var.d(f15, false);
                if (y5Var.f34812c == 1.0f) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                y5Var2.d(f16, false);
                if (y5Var2.f34812c > 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    int i10 = (int) (y5Var2.f34812c * 255.0f);
                    org.telegram.ui.Components.voip.h hVar = this.f13526f;
                    hVar.f33587a.setAlpha(i10);
                    hVar.f33589c.setAlpha(i10);
                    hVar.f33591f = getMeasuredWidth() * 2;
                    hVar.f33598n = 1.3f;
                    hVar.a(AndroidUtilities.dp(10.0f), canvas2, rectF, this);
                }
                e4Var.U2 = false;
            } else {
                if (!y2Var.hasBitmapImage()) {
                    b4Var2.f13086f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    b4Var2.f13086f.draw(canvas2);
                }
                y2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                y2Var.draw(canvas2);
                if (e4Var.G1) {
                    i9 i9Var = this.f13530w;
                    boolean z13 = i9Var.f13464a;
                    if (z13 && (h9Var2 = d4Var.f13192b) != null && h9Var2.paused && h9Var2.playerStubBitmap != null && h9Var2.stubAvailable) {
                        float measuredWidth = getMeasuredWidth() / d4Var.f13192b.playerStubBitmap.getWidth();
                        float measuredHeight = getMeasuredHeight() / d4Var.f13192b.playerStubBitmap.getHeight();
                        canvas2.save();
                        canvas2.scale(measuredWidth, measuredHeight);
                        h9 h9Var3 = d4Var.f13192b;
                        canvas2.drawBitmap(h9Var3.playerStubBitmap, 0.0f, 0.0f, h9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z14 = Build.VERSION.SDK_INT >= 29 && (dVar = e4Var.D3) != null && canvas2 == dVar.f19456r;
                        if (!z13 || (e4Var.X0 && !i9Var.D0 && !z14)) {
                            d4Var.d.draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z11 = e4Var.U2;
            y5Var = this.h;
            y5Var2 = this.f13527n;
            if (z11) {
                y5Var.d(f14, true);
                y5Var2.d(f14, true);
            }
            if (c4Var.f13145f) {
                d1Var = d4Var.f13191a;
                if (d1Var == null) {
                }
                zHasNotThumb = false;
            } else if (!c4Var.f13144e) {
                if (d4Var.d != null) {
                }
                zHasNotThumb = false;
            } else {
                zHasNotThumb = y2Var.hasNotThumb();
            }
            if (e4Var.G1) {
                f15 = 0.0f;
            } else {
                f15 = 0.0f;
            }
            y5Var.d(f15, false);
            if (y5Var.f34812c == 1.0f) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            y5Var2.d(f16, false);
            if (y5Var2.f34812c > 0.0f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                int i11 = (int) (y5Var2.f34812c * 255.0f);
                org.telegram.ui.Components.voip.h hVar2 = this.f13526f;
                hVar2.f33587a.setAlpha(i11);
                hVar2.f33589c.setAlpha(i11);
                hVar2.f33591f = getMeasuredWidth() * 2;
                hVar2.f33598n = 1.3f;
                hVar2.a(AndroidUtilities.dp(10.0f), canvas2, rectF2, this);
            }
            e4Var.U2 = false;
        }
        if (n3Var.getAlpha() > 0.0f) {
            if (n3Var.getAlpha() == f10) {
                canvas2.save();
                b4Var = b4Var2;
                z10 = false;
            } else {
                b4Var = b4Var2;
                z10 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, n3Var.getMeasuredWidth(), n3Var.getMeasuredHeight(), (int) (n3Var.getAlpha() * 255.0f), 31);
            }
            f3Var.draw(canvas2);
            canvas2.restore();
            r15 = z10;
        } else {
            b4Var = b4Var2;
            r15 = 0;
        }
        if (!e4Var.V0 && y2Var.hasNotThumb()) {
            e4Var.V0 = true;
            e4Var.invalidate();
        }
        float hideInterfaceAlpha = e4Var.getHideInterfaceAlpha();
        Drawable drawable = b4Var.d;
        Paint paint = b4Var.f13084c;
        Drawable drawable2 = b4Var.f13085e;
        drawable.setAlpha(255);
        b4Var.d.draw(canvas2);
        if (!e4Var.f13295y1 && e4Var.f13276t2 && n3Var.getVisibility() != 0) {
            f12 = 0.0f;
        } else if (n3Var.getVisibility() == 0) {
            int iDp = AndroidUtilities.dp(72.0f);
            int top = n3Var.getTop() + ((int) (n3Var.getTextTop() - AndroidUtilities.dp(24.0f)));
            int i12 = iDp + top;
            float measuredHeight2 = getMeasuredHeight() * 0.65f;
            if ((measuredHeight2 - top) / AndroidUtilities.dp(60.0f) > 0.0f && n3Var.f13063s0 && n3Var.f13058n0.getBottom() - n3Var.getMeasuredHeight() > 0) {
                if ((measuredHeight2 - (n3Var.getTop() + ((int) (n3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                    e4Var.f13225c3 = true;
                }
                f11 = 0.0f;
            } else if (e4Var.f13228d3) {
                e4Var.f13228d3 = r15;
                f11 = 0.0f;
                if ((measuredHeight2 - (n3Var.getTop() + ((int) (n3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                    e4Var.f13225c3 = true;
                }
            } else {
                f11 = 0.0f;
                if (n3Var.getProgressToBlackout() == 0.0f) {
                    e4Var.f13225c3 = r15;
                }
            }
            float fD = this.f13525e.d(e4Var.f13225c3 ? 1.0f : 0.0f, r15);
            if (fD > f11) {
                this.f13528r = true;
                this.f13529s = r15;
                super.dispatchDraw(canvas);
                this.f13528r = r15;
                b(canvas);
                paint.setColor(i0.b.k(-16777216, (int) (153.0f * fD * hideInterfaceAlpha)));
                canvas2.drawPaint(paint);
            }
            if (fD < f10 && !c4Var.f13145f) {
                canvas2.save();
                float f23 = f10 - fD;
                paint.setColor(i0.b.k(-16777216, (int) (129.03f * f23 * hideInterfaceAlpha)));
                drawable2.setAlpha((int) (f23 * 255.0f * hideInterfaceAlpha));
                drawable2.setBounds(r15, top, getMeasuredWidth(), i12);
                drawable2.draw(canvas2);
                canvas2.drawRect(0.0f, i12, getMeasuredWidth(), getMeasuredHeight(), paint);
                canvas.restore();
            }
            if (fD <= f11 || n3Var.getAlpha() <= 0.0f) {
                canvas2 = canvas;
            } else {
                if (n3Var.f13060p0) {
                    n3Var.f13060p0 = r15;
                    n3Var.invalidate();
                }
                if (n3Var.getAlpha() != f10) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (n3Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                    canvas2.save();
                }
                canvas2.translate(n3Var.getX(), n3Var.getY() - n3Var.getScrollY());
                n3Var.draw(canvas2);
                canvas2.restore();
            }
            boolean z15 = fD > f11;
            if (n3Var.f13060p0 != z15) {
                n3Var.f13060p0 = z15;
                n3Var.invalidate();
            }
            if (fD > f11) {
                this.f13528r = true;
                this.f13529s = true;
                super.dispatchDraw(canvas);
                this.f13528r = r15;
            }
            f12 = fD;
        } else {
            if (!c4Var.f13145f) {
                int iDp2 = AndroidUtilities.dp(e4Var.f13276t2 ? 56.0f : 110.0f);
                if ((e4Var.f13295y1 || !e4Var.f13276t2) && n3Var.getVisibility() == 0) {
                    iDp2 = (int) (iDp2 * 2.5f);
                }
                drawable2.setBounds(r15, j3Var.getMeasuredHeight() - iDp2, getMeasuredWidth(), j3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
            f12 = 0.0f;
        }
        float f24 = e4Var.f13241i1;
        if (f24 == 0.0f || (h4Var = e4Var.f13238h1) == null) {
            f13 = 1.0f;
        } else {
            float f25 = e4Var.f13289w3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight3 = getMeasuredHeight() + 1;
            i4 i4Var = h4Var.f13385f;
            ImageReceiver imageReceiver = h4Var.f13381a;
            float f26 = (float) r15;
            imageReceiver.setImageCoords(f26, f26, measuredWidth2, measuredHeight3);
            imageReceiver.setAlpha(f24);
            imageReceiver.draw(canvas2);
            f13 = 1.0f;
            imageReceiver.setAlpha(1.0f);
            if (h4Var.f13383c != null) {
                int i13 = (int) (f24 * 255.0f);
                h4Var.d.setAlpha(i13);
                GradientDrawable gradientDrawable = i4Var.D;
                gradientDrawable.setAlpha(i13);
                gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f25)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                gradientDrawable.draw(canvas2);
                canvas2.save();
                canvas2.scale(f25, f25, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f25));
                canvas2.translate(imageReceiver.getCenterX() - (i4Var.F / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f25)) - h4Var.f13383c.getHeight());
                h4Var.f13383c.draw(canvas2);
                canvas2.restore();
            }
        }
        if (!e4Var.C2) {
            f13 = 0.0f;
        }
        this.d.d(f13, r15);
        if (e4Var.G1) {
            boolean z16 = n3Var.getVisibility() == 0 && (e4Var.f13225c3 || n3Var.f13063s0);
            e4Var.f13234f3 = n3Var.getVisibility() == 0 && n3Var.getProgressToBlackout() > 0.0f;
            i9 i9Var2 = ((z8) e4Var.M1).d;
            i9Var2.H0 = z16;
            i9Var2.P();
            ((z8) e4Var.M1).d.f13486i1 = e4Var.f13234f3;
        }
        if (f12 <= 0.0f) {
            super.dispatchDraw(canvas);
            b(canvas);
        }
        sy syVar = e4Var.f13235g1;
        if (syVar != null) {
            syVar.e(canvas2);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d1 d1Var;
        e4 e4Var = this.f13531x;
        d4 d4Var = e4Var.I2;
        if (!e4Var.G1 || e4Var.Y2 || d4Var.d == null || (d1Var = d4Var.f13191a) == null || !d1Var.n() || !d4Var.d.dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f13531x.f13232f1) {
            return true;
        }
        if (!this.f13528r) {
            return super.drawChild(canvas, view, j10);
        }
        ec ecVar = ec.f28012w;
        if (ecVar == null || view != ecVar.f28016e) {
            return super.drawChild(canvas, view, j10);
        }
        if (this.f13529s) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13531x.f13235g1.j();
        ec.a(this, new gh.w0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e4 e4Var = this.f13531x;
        e4Var.f13235g1.k();
        ec.h(this);
        y3 y3Var = e4Var.M1;
        if (y3Var != null) {
            i9 i9Var = ((z8) y3Var).d;
            i9Var.U0 = false;
            i9Var.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13531x.f13278u0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
