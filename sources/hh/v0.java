package hh;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;

public final class v0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public m7 B;
    public final ArrayList C;
    public final ArrayList D;
    public final HashSet E;
    public int F;
    public final DecelerateInterpolator G;
    public final LinearInterpolator H;
    public u0 I;

    public final int f10188a;

    public final long f10189b;

    public final View f10190c;
    public boolean d;

    public float f10191e;

    public float f10192f;
    public boolean h;

    public float f10193n;

    public float f10194r;

    public float f10195s;
    public float v;

    public float f10196w;

    public float f10197x;

    public final org.telegram.ui.Components.y5 f10198y;

    public v0(Context context, int i10, long j10, org.telegram.ui.n0 n0Var) {
        super(context);
        this.d = true;
        this.f10198y = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        this.A = 1.0f;
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new HashSet();
        this.G = new DecelerateInterpolator();
        this.H = new LinearInterpolator();
        this.f10188a = i10;
        this.f10189b = j10;
        this.f10190c = n0Var;
    }

    public final void a() {
        TLRPC.EmojiStatus emojiStatus;
        boolean z10;
        u0 u0Var;
        u0 u0Var2;
        int i10 = this.f10188a;
        if (MessagesController.getInstance(i10).enableGiftsInProfile) {
            this.F = MessagesController.getInstance(i10).stargiftsPinnedToTopLimit;
            ArrayList arrayList = this.C;
            arrayList.clear();
            ArrayList arrayList2 = this.D;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            HashSet hashSet = this.E;
            hashSet.clear();
            long j10 = this.f10189b;
            if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user == null) {
                    emojiStatus = null;
                } else {
                    emojiStatus = user.emoji_status;
                }
            } else {
                TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(-j10));
                if (user2 == null) {
                    emojiStatus = null;
                } else {
                    emojiStatus = user2.emoji_status;
                }
            }
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                hashSet.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
            }
            int i11 = 0;
            m7 m7VarG = u7.y(i10, false).G(j10, true);
            this.B = m7VarG;
            if (m7VarG != null) {
                for (int i12 = 0; i12 < this.B.f9753l.size(); i12++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.B.f9753l.get(i12);
                    if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            u0 u0Var3 = new u0(this, (TL_stars.TL_starGiftUnique) starGift);
                            long j11 = u0Var3.f10119a;
                            if (!hashSet.contains(Long.valueOf(j11))) {
                                arrayList2.add(u0Var3);
                                hashSet.add(Long.valueOf(j11));
                            }
                        }
                    }
                }
            }
            if (arrayList2.size() != arrayList.size()) {
                z10 = true;
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    z10 = false;
                    break;
                }
                u0 u0Var4 = (u0) arrayList2.get(i13);
                u0 u0Var5 = (u0) arrayList.get(i13);
                u0Var4.getClass();
                if (u0Var5 == null || u0Var5.f10119a != u0Var4.f10119a) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                u0 u0Var6 = (u0) arrayList2.get(i14);
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList.size()) {
                        u0Var2 = null;
                        break;
                    } else {
                        if (((u0) arrayList.get(i15)).f10119a == u0Var6.f10119a) {
                            u0Var2 = (u0) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    }
                }
                if (u0Var2 != null) {
                    u0Var6.getClass();
                    u0Var6.h = u0Var2.h;
                    u0Var6.f10126j = u0Var2.f10126j;
                    u0Var6.f10125i = u0Var2.f10125i;
                    u0Var6.f10127k = u0Var2.f10127k;
                    u0Var6.f10123f = u0Var2.f10123f;
                    u0Var6.f10124g = u0Var2.f10124g;
                } else {
                    float fDp = AndroidUtilities.dp(22.5f);
                    int i16 = u0Var6.d;
                    u0Var6.h = new RadialGradient(0.0f, 0.0f, fDp, new int[]{i16, org.telegram.ui.ActionBar.g6.l1(0.0f, i16)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Paint paint = new Paint(1);
                    u0Var6.f10125i = paint;
                    paint.setShader(u0Var6.h);
                    TLRPC.Document document = u0Var6.f10120b;
                    if (document != null) {
                        u0Var6.f10126j = org.telegram.ui.Components.k5.m(i10, i11, document);
                    } else {
                        u0Var6.f10126j = org.telegram.ui.Components.k5.n(i10, u0Var6.f10121c, null, i11);
                    }
                    org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(this, 0L, 320L, (TimeInterpolator) null);
                    u0Var6.f10127k = y5Var;
                    y5Var.d(0.0f, true);
                    if (isAttachedToWindow()) {
                        u0Var6.f10126j.a(this);
                    }
                }
                i14++;
                i11 = 0;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int iF = 0; iF < this.F; iF = i0.a.f(iF, iF, 1, arrayList3)) {
            }
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                u0 u0Var7 = (u0) arrayList.get(i17);
                int i18 = 0;
                while (true) {
                    if (i18 >= arrayList2.size()) {
                        u0Var = null;
                        break;
                    } else {
                        if (((u0) arrayList2.get(i18)).f10119a == u0Var7.f10119a) {
                            u0Var = (u0) arrayList2.get(i18);
                            break;
                        }
                        i18++;
                    }
                }
                if (u0Var == null) {
                    u0Var7.f10126j.o(this);
                    u0Var7.f10126j = null;
                    u0Var7.h = null;
                } else {
                    arrayList3.remove(Integer.valueOf(u0Var7.f10124g));
                }
            }
            if (!arrayList3.isEmpty()) {
                com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(arrayList3);
                for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                    u0 u0Var8 = (u0) arrayList2.get(i19);
                    if (u0Var8.f10124g == -1) {
                        u0Var8.f10124g = ((Integer) rVar.c()).intValue();
                    }
                }
            }
            if (z10) {
                invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f10189b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fDp;
        int iDp;
        float fLerp;
        float fMin;
        float f10;
        float fClamp01;
        float fDp2;
        float f11;
        Paint paint;
        u0 u0Var;
        v0 v0Var = this;
        ArrayList arrayList = v0Var.D;
        if (arrayList.isEmpty()) {
            return;
        }
        float f12 = 1.0f;
        if (v0Var.f10191e >= 1.0f || v0Var.f10192f <= 0.0f) {
            return;
        }
        View view = v0Var.f10190c;
        float x8 = view.getX();
        float y10 = view.getY();
        float scaleX = view.getScaleX() * view.getWidth();
        float scaleY = view.getScaleY() * view.getHeight();
        float fDpf2 = AndroidUtilities.dpf2(96.0f);
        float fMin2 = Math.min(x8, (v0Var.getWidth() - fDpf2) / 2.0f);
        float fMax = Math.max(y10, (v0Var.f10197x - fDpf2) / 2.0f);
        float fMax2 = Math.max(scaleX, fDpf2);
        float fMax3 = Math.max(scaleY, fDpf2);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, v0Var.getWidth(), v0Var.f10196w);
        float f13 = (fMax2 / 2.0f) + fMin2;
        float f14 = (fMax3 / 2.0f) + fMax;
        float f15 = (scaleX / 2.0f) + x8;
        float f16 = (scaleY / 2.0f) + y10;
        float f17 = v0Var.f10196w;
        float f18 = f17 / v0Var.f10197x;
        float fClamp02 = Utilities.clamp01((f17 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) / AndroidUtilities.dp(50.0f));
        boolean z10 = false;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            u0 u0Var2 = (u0) arrayList.get(i10);
            float fD = u0Var2.f10127k.d(f12, z10);
            float fLerp2 = AndroidUtilities.lerp(0.5f, f12, fD);
            int i11 = i10;
            float fZ = org.telegram.messenger.y1.z(f12, v0Var.f10193n, (f12 - v0Var.f10191e) * fD, fClamp02);
            int i12 = u0Var2.f10124g;
            float f19 = 1.6f;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        fDp = ((f13 * 2.0f) / 3.0f) - (AndroidUtilities.dp(12.0f) * f18);
                        fLerp = (fMax + fMax3) - AndroidUtilities.dp(16.0f);
                    } else if (i12 == 3) {
                        fDp = (AndroidUtilities.dp(20.0f) * f18) + (1.5f * f13);
                        iDp = AndroidUtilities.dp(13.0f);
                    } else if (i12 != 4) {
                        fDp = (AndroidUtilities.dp(12.0f) * f18) + ((4.0f * f13) / 3.0f);
                        fLerp = (fMax + fMax3) - AndroidUtilities.dp(16.0f);
                    } else {
                        fDp = (AndroidUtilities.dp(12.0f) * f18) + ((f13 * 4.0f) / 3.0f);
                        fLerp = fMax - AndroidUtilities.dp(4.0f);
                    }
                    f19 = 0.9f;
                    if (!v0Var.h || fD >= 1.0f) {
                        fMin = v0Var.f10192f;
                    } else {
                        fMin = Math.min(fD, v0Var.f10192f);
                    }
                    f10 = f19 * 0.2f;
                    if (fMin >= 1.0f - f10) {
                        fClamp01 = 1.0f;
                    } else {
                        fClamp01 = Utilities.clamp01(((fMin - 0.32000002f) + f10) / 0.67999995f);
                    }
                    if (fClamp01 < 1.0f) {
                        fDp = AndroidUtilities.lerp(f15, fDp, v0Var.G.getInterpolation(fClamp01));
                        fLerp = AndroidUtilities.lerp(f16, fLerp, v0Var.H.getInterpolation(fClamp01));
                        fLerp2 = AndroidUtilities.lerp(fLerp2 / 2.0f, fLerp2, fClamp01);
                    }
                    if (fZ > 0.0f) {
                        fDp2 = AndroidUtilities.dp(45.0f);
                        float f20 = fLerp2;
                        f11 = fDp2 / 2.0f;
                        u0Var2.f10128l.set(fDp - f11, fLerp - f11, fDp + f11, fLerp + f11);
                        canvas.save();
                        canvas.translate(fDp, fLerp);
                        canvas.rotate(0.0f);
                        float fA = u0Var2.f10129m.a(0.1f) * f20;
                        canvas.scale(fA, fA);
                        u0Var2.f10123f.d();
                        u0Var2.f10123f.b(canvas, u0Var2.d, fZ);
                        paint = u0Var2.f10125i;
                        if (paint != null) {
                            paint.setAlpha((int) (fZ * 255.0f * 1.0f));
                            float f21 = (-fDp2) / 2.0f;
                            u0Var = u0Var2;
                            canvas.drawRect(f21, f21, f11, f11, u0Var2.f10125i);
                        } else {
                            u0Var = u0Var2;
                        }
                        if (u0Var.f10126j != null) {
                            int iDp2 = AndroidUtilities.dp(24.0f);
                            int i13 = (-iDp2) / 2;
                            int i14 = iDp2 / 2;
                            u0Var.f10126j.setBounds(i13, i13, i14, i14);
                            u0Var.f10126j.setAlpha((int) (fZ * 255.0f));
                            u0Var.f10126j.draw(canvas);
                        }
                        canvas.restore();
                    }
                    i10 = i11 + 1;
                    v0Var = this;
                    f16 = f16;
                    arrayList = arrayList;
                    fClamp02 = fClamp02;
                    z10 = false;
                    f12 = 1.0f;
                } else {
                    fDp = ((f13 * 2.0f) / 3.0f) - (AndroidUtilities.dp(6.0f) * f18);
                    fLerp = fMax - AndroidUtilities.dp(4.0f);
                }
                f19 = 0.0f;
                if (v0Var.h) {
                    fMin = v0Var.f10192f;
                } else {
                    fMin = v0Var.f10192f;
                }
                f10 = f19 * 0.2f;
                if (fMin >= 1.0f - f10) {
                    fClamp01 = 1.0f;
                } else {
                    fClamp01 = Utilities.clamp01(((fMin - 0.32000002f) + f10) / 0.67999995f);
                }
                if (fClamp01 < 1.0f) {
                    fDp = AndroidUtilities.lerp(f15, fDp, v0Var.G.getInterpolation(fClamp01));
                    fLerp = AndroidUtilities.lerp(f16, fLerp, v0Var.H.getInterpolation(fClamp01));
                    fLerp2 = AndroidUtilities.lerp(fLerp2 / 2.0f, fLerp2, fClamp01);
                }
                if (fZ > 0.0f) {
                    fDp2 = AndroidUtilities.dp(45.0f);
                    float f22 = fLerp2;
                    f11 = fDp2 / 2.0f;
                    u0Var2.f10128l.set(fDp - f11, fLerp - f11, fDp + f11, fLerp + f11);
                    canvas.save();
                    canvas.translate(fDp, fLerp);
                    canvas.rotate(0.0f);
                    float fA2 = u0Var2.f10129m.a(0.1f) * f22;
                    canvas.scale(fA2, fA2);
                    u0Var2.f10123f.d();
                    u0Var2.f10123f.b(canvas, u0Var2.d, fZ);
                    paint = u0Var2.f10125i;
                    if (paint != null) {
                        paint.setAlpha((int) (fZ * 255.0f * 1.0f));
                        float f23 = (-fDp2) / 2.0f;
                        u0Var = u0Var2;
                        canvas.drawRect(f23, f23, f11, f11, u0Var2.f10125i);
                    } else {
                        u0Var = u0Var2;
                    }
                    if (u0Var.f10126j != null) {
                        int iDp3 = AndroidUtilities.dp(24.0f);
                        int i15 = (-iDp3) / 2;
                        int i16 = iDp3 / 2;
                        u0Var.f10126j.setBounds(i15, i15, i16, i16);
                        u0Var.f10126j.setAlpha((int) (fZ * 255.0f));
                        u0Var.f10126j.draw(canvas);
                    }
                    canvas.restore();
                }
                i10 = i11 + 1;
                v0Var = this;
                f16 = f16;
                arrayList = arrayList;
                fClamp02 = fClamp02;
                z10 = false;
                f12 = 1.0f;
            } else {
                fDp = (f13 / 2.0f) - (AndroidUtilities.dp(20.0f) * f18);
                iDp = AndroidUtilities.dp(13.0f);
            }
            fLerp = f14 - iDp;
            if (v0Var.h) {
                fMin = v0Var.f10192f;
            } else {
                fMin = v0Var.f10192f;
            }
            f10 = f19 * 0.2f;
            if (fMin >= 1.0f - f10) {
                fClamp01 = 1.0f;
            } else {
                fClamp01 = Utilities.clamp01(((fMin - 0.32000002f) + f10) / 0.67999995f);
            }
            if (fClamp01 < 1.0f) {
                fDp = AndroidUtilities.lerp(f15, fDp, v0Var.G.getInterpolation(fClamp01));
                fLerp = AndroidUtilities.lerp(f16, fLerp, v0Var.H.getInterpolation(fClamp01));
                fLerp2 = AndroidUtilities.lerp(fLerp2 / 2.0f, fLerp2, fClamp01);
            }
            if (fZ > 0.0f) {
                fDp2 = AndroidUtilities.dp(45.0f);
                float f24 = fLerp2;
                f11 = fDp2 / 2.0f;
                u0Var2.f10128l.set(fDp - f11, fLerp - f11, fDp + f11, fLerp + f11);
                canvas.save();
                canvas.translate(fDp, fLerp);
                canvas.rotate(0.0f);
                float fA3 = u0Var2.f10129m.a(0.1f) * f24;
                canvas.scale(fA3, fA3);
                u0Var2.f10123f.d();
                u0Var2.f10123f.b(canvas, u0Var2.d, fZ);
                paint = u0Var2.f10125i;
                if (paint != null) {
                    paint.setAlpha((int) (fZ * 255.0f * 1.0f));
                    float f25 = (-fDp2) / 2.0f;
                    u0Var = u0Var2;
                    canvas.drawRect(f25, f25, f11, f11, u0Var2.f10125i);
                } else {
                    u0Var = u0Var2;
                }
                if (u0Var.f10126j != null) {
                    int iDp4 = AndroidUtilities.dp(24.0f);
                    int i17 = (-iDp4) / 2;
                    int i18 = iDp4 / 2;
                    u0Var.f10126j.setBounds(i17, i17, i18, i18);
                    u0Var.f10126j.setAlpha((int) (fZ * 255.0f));
                    u0Var.f10126j.draw(canvas);
                }
                canvas.restore();
            }
            i10 = i11 + 1;
            v0Var = this;
            f16 = f16;
            arrayList = arrayList;
            fClamp02 = fClamp02;
            z10 = false;
            f12 = 1.0f;
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f10188a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((u0) obj).f10126j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f10188a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((u0) obj).f10126j.o(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u0 u0Var;
        u0 u0Var2;
        if (!this.d) {
            return false;
        }
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 >= arrayList.size()) {
                u0Var = null;
                break;
            }
            if (((u0) arrayList.get(i10)).f10128l.contains(x8, y10)) {
                u0Var = (u0) arrayList.get(i10);
                break;
            }
            i10++;
        }
        if (motionEvent.getAction() == 0) {
            this.I = u0Var;
            if (u0Var != null) {
                u0Var.f10129m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            u0 u0Var3 = this.I;
            if (u0Var3 != u0Var && u0Var3 != null) {
                u0Var3.f10129m.c(false);
                this.I = null;
            }
        } else if (motionEvent.getAction() == 1) {
            u0 u0Var4 = this.I;
            if (u0Var4 != null) {
                we.e.s(getContext(), "https://t.me/nft/" + u0Var4.f10122e);
                this.I.f10129m.c(false);
                this.I = null;
            }
        } else if (motionEvent.getAction() == 3 && (u0Var2 = this.I) != null) {
            u0Var2.f10129m.c(false);
            this.I = null;
        }
        return this.I != null;
    }

    public void setActionBarActionMode(float f10) {
        this.f10193n = f10;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f10) {
        this.f10196w = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.f10191e != f10) {
            this.f10191e = f10;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.A == f10) {
            return;
        }
        this.A = f10;
        invalidate();
    }
}
