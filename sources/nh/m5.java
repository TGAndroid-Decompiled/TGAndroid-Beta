package nh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class m5 extends FrameLayout {
    public final g5 B;
    public final ArrayList C;
    public final ArrayList D;
    public final p4 E;
    public float F;
    public final j5 f15588a;
    public float f15589b;
    public float f15590c;
    public float d;
    public final k5 e;
    public float f15591f;
    public final f5 h;
    public float f15592n;
    public final i9 f15593r;
    public final Drawable f15594s;
    public float v;
    public boolean f15595w;
    public int f15596x;
    public long f15597y;

    public m5(Context context, i9 i9Var) {
        super(context);
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new p4();
        b bVar = i9Var.f15479y;
        this.f15593r = i9Var;
        f5 f5Var = new f5(getContext(), this, i9Var);
        this.h = f5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f15594s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, bVar), PorterDuff.Mode.MULTIPLY));
        k5 k5Var = new k5(this, context);
        this.e = k5Var;
        g5 g5Var = new g5(this, context);
        this.B = g5Var;
        g5Var.b(new h5(0, this));
        j5 j5Var = new j5(context, this, i9Var);
        this.f15588a = j5Var;
        g5Var.setAdapter(j5Var);
        k5Var.addView(g5Var, k7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(f5Var, k7.b6.c(-1.0f, -1));
        addView(k5Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f10 = this.d;
        d5 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f10;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.C;
        arrayList2.clear();
        this.f15597y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f15553a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f15593r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f15554b = (s6) E.get(i12);
                arrayList2.add(obj2);
            }
        }
        f5 f5Var = this.h;
        ArrayList arrayList3 = f5Var.D;
        ArrayList arrayList4 = f5Var.B;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        f5Var.d();
        if (f5Var.getMeasuredHeight() > 0) {
            f5Var.c(i10, false, false);
        } else {
            f5Var.f15395w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((h4) arrayList3.get(i13)).a(((h4) arrayList3.get(i13)).f15359b);
        }
        g5 g5Var = this.B;
        g5Var.setAdapter(null);
        j5 j5Var = this.f15588a;
        g5Var.setAdapter(j5Var);
        j5Var.g();
        g5Var.setCurrentItem(i10);
    }

    public h4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public d5 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 < arrayList.size()) {
                if (((Integer) ((d5) arrayList.get(i10)).getTag()).intValue() == this.B.getCurrentItem()) {
                    return (d5) arrayList.get(i10);
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition >= 0) {
            ArrayList arrayList = this.C;
            if (closestPosition < arrayList.size()) {
                return ((l5) arrayList.get(closestPosition)).f15553a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f15593r.f15431b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        f5 f5Var = this.h;
        ((FrameLayout.LayoutParams) f5Var.getLayoutParams()).topMargin = i12;
        this.f15592n = f5Var.getFinalHeight();
        this.f15589b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f15592n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f15590c = size - dp;
        while (true) {
            ArrayList arrayList = this.D;
            if (i13 < arrayList.size()) {
                ((d5) arrayList.get(i13)).setListBottomPadding(this.d);
                i13++;
            } else {
                super.onMeasure(i10, i11);
                return;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        boolean z4;
        boolean z10;
        d5 currentPage;
        float f10;
        if (this.f15596x >= AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != z4) {
            float f11 = this.F;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            ofFloat.addUpdateListener(new e5(this, 0));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20518w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f15596x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f15250r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f15247c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.z((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.r1.f20518w);
            }
        }
    }

    public void setOffset(float f10) {
        int i10;
        int closestPosition;
        int i11;
        if (this.v != f10) {
            this.v = f10;
            this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
            float f11 = this.f15591f;
            float clamp = Utilities.clamp(f10 / this.f15590c, 1.0f, 0.0f);
            this.f15591f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            i9 i9Var = this.f15593r;
            d4 t6 = i9Var.t();
            f9 f9Var = i9Var.f15461p0;
            f5 f5Var = this.h;
            if (f11 == 1.0f && this.f15591f != 1.0f) {
                if (i9Var.L0 != null) {
                    MessageObject messageObject = (MessageObject) i9Var.L0.f15560i.get(Utilities.clamp(f5Var.getClosestPosition(), i9Var.L0.f15560i.size() - 1, 0));
                    long b10 = l6.b(messageObject);
                    ImageReceiver imageReceiver = f9Var.f15314c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        f9Var.f15314c = null;
                    }
                    y8 y8Var = i9Var.f15452k0;
                    int i12 = messageObject.storyItem.f19394id;
                    i9 i9Var2 = y8Var.K0;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= y8Var.f15826u0.size()) {
                            break;
                        } else if (b10 == l6.b(i9Var2.L0.f(((Integer) ((ArrayList) y8Var.f15826u0.get(i13)).get(0)).intValue()))) {
                            if (i9Var2.O0) {
                                i11 = (y8Var.f15826u0.size() - 1) - i13;
                            } else {
                                i11 = i13;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < ((ArrayList) y8Var.f15826u0.get(i13)).size()) {
                                    if (((Integer) ((ArrayList) y8Var.f15826u0.get(i13)).get(i14)).intValue() == i12) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i14 = 0;
                                    break;
                                }
                            }
                            if (y8Var.getCurrentPeerView() != null && y8Var.getCurrentItem() == i11) {
                                d4 currentPeerView = y8Var.getCurrentPeerView();
                                if (currentPeerView.G1 != i14) {
                                    currentPeerView.G1 = i14;
                                    currentPeerView.f1(false);
                                }
                            } else {
                                y8Var.x(i11, false);
                                d4 currentPeerView2 = y8Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    q7 q7Var = (q7) currentPeerView2.getParent();
                                    q7Var.a(true);
                                    if (y8Var.f15826u0 != null) {
                                        d4 d4Var = q7Var.f15787a;
                                        long j10 = q7Var.f15788b;
                                        ArrayList arrayList = q7Var.f15789c;
                                        d4Var.f15238y1 = j10;
                                        d4Var.f15230w1 = arrayList;
                                        d4Var.o0(i14);
                                    } else {
                                        q7Var.f15787a.U0(i14, q7Var.f15788b);
                                    }
                                }
                            }
                        } else {
                            i13++;
                        }
                    }
                } else if (t6 != null && t6.G1 != (closestPosition = f5Var.getClosestPosition())) {
                    t6.G1 = closestPosition;
                    t6.f1(false);
                }
                f5Var.d.abortAnimation();
                ValueAnimator valueAnimator = f5Var.J;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    f5Var.J = null;
                }
                f5Var.c(f5Var.H, false, true);
            }
            if (t6 != null) {
                i3 i3Var = t6.Z0;
                f5Var.f15388a = i3Var.getTop();
                f5Var.f15389b = i3Var.getMeasuredWidth();
                f5Var.f15390c = i3Var.getMeasuredHeight();
            }
            f5Var.setProgressToOpen(this.f15591f);
            g5 g5Var = this.B;
            if (g5Var.f15341t0 && this.f15591f != 1.0f) {
                g5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f15591f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f15591f != 1.0f) {
                g5Var.f15341t0 = false;
            }
        }
    }
}
