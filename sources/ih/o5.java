package ih;

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
public final class o5 extends FrameLayout {
    public final i5 A;
    public final ArrayList B;
    public final ArrayList C;
    public final s4 D;
    public float E;
    public final l5 f11890a;
    public float f11891b;
    public float f11892c;
    public float d;
    public final m5 f11893e;
    public float f11894f;
    public final h5 h;
    public float f11895n;
    public final m9 f11896r;
    public final Drawable f11897s;
    public float v;
    public boolean f11898w;
    public int f11899x;
    public long f11900y;

    public o5(Context context, m9 m9Var) {
        super(context);
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new s4();
        b bVar = m9Var.f11834y;
        this.f11896r = m9Var;
        h5 h5Var = new h5(getContext(), this, m9Var);
        this.h = h5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f11897s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, bVar), PorterDuff.Mode.MULTIPLY));
        m5 m5Var = new m5(this, context);
        this.f11893e = m5Var;
        i5 i5Var = new i5(this, context);
        this.A = i5Var;
        i5Var.b(new j5(0, this));
        l5 l5Var = new l5(context, this, m9Var);
        this.f11890a = l5Var;
        i5Var.setAdapter(l5Var);
        m5Var.addView(i5Var, g7.e6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(h5Var, g7.e6.c(-1.0f, -1));
        addView(m5Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f10 = this.d;
        g5 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f10;
    }

    public final void b(int i9, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.B;
        arrayList2.clear();
        this.f11900y = j10;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ?? obj = new Object();
            obj.f11843a = (TL_stories.StoryItem) arrayList.get(i10);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f11896r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i11 = 0; i11 < E.size(); i11++) {
                ?? obj2 = new Object();
                obj2.f11844b = (u6) E.get(i11);
                arrayList2.add(obj2);
            }
        }
        h5 h5Var = this.h;
        ArrayList arrayList3 = h5Var.C;
        ArrayList arrayList4 = h5Var.A;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        h5Var.d();
        if (h5Var.getMeasuredHeight() > 0) {
            h5Var.c(i9, false, false);
        } else {
            h5Var.f11764w = i9;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((l4) arrayList3.get(i12)).a(((l4) arrayList3.get(i12)).f11707b);
        }
        i5 i5Var = this.A;
        i5Var.setAdapter(null);
        l5 l5Var = this.f11890a;
        i5Var.setAdapter(l5Var);
        l5Var.g();
        i5Var.setCurrentItem(i9);
    }

    public l4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public g5 getCurrentPage() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i9 < arrayList.size()) {
                if (((Integer) ((g5) arrayList.get(i9)).getTag()).intValue() == this.A.getCurrentItem()) {
                    return (g5) arrayList.get(i9);
                }
                i9++;
            } else {
                return null;
            }
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition >= 0) {
            ArrayList arrayList = this.B;
            if (closestPosition < arrayList.size()) {
                return ((n5) arrayList.get(closestPosition)).f11843a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12 = 0;
        if (this.f11896r.f11786b) {
            i11 = AndroidUtilities.statusBarHeight;
        } else {
            i11 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        h5 h5Var = this.h;
        ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).topMargin = i11;
        this.f11895n = h5Var.getFinalHeight();
        this.f11891b = AndroidUtilities.dp(20.0f) + i11;
        ((FrameLayout.LayoutParams) this.f11893e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i11) + this.f11895n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f11892c = size - dp;
        while (true) {
            ArrayList arrayList = this.C;
            if (i12 < arrayList.size()) {
                ((g5) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            } else {
                super.onMeasure(i9, i10);
                return;
            }
        }
    }

    public void setKeyboardHeight(int i9) {
        boolean z10;
        boolean z11;
        g5 currentPage;
        float f10;
        if (this.f11899x >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i9 >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            float f11 = this.E;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            ofFloat.addUpdateListener(new bg.b(this, 21));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f11899x = i9;
        if (i9 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f11481r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f11477c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.l((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.q1.f23713w);
            }
        }
    }

    public void setOffset(float f10) {
        int i9;
        int closestPosition;
        int i10;
        if (this.v != f10) {
            this.v = f10;
            this.f11893e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
            float f11 = this.f11894f;
            float clamp = Utilities.clamp(f10 / this.f11892c, 1.0f, 0.0f);
            this.f11894f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            m9 m9Var = this.f11896r;
            i4 t10 = m9Var.t();
            j9 j9Var = m9Var.f11815o0;
            h5 h5Var = this.h;
            if (f11 == 1.0f && this.f11894f != 1.0f) {
                if (m9Var.K0 != null) {
                    MessageObject messageObject = (MessageObject) m9Var.K0.f11851i.get(Utilities.clamp(h5Var.getClosestPosition(), m9Var.K0.f11851i.size() - 1, 0));
                    long b10 = n6.b(messageObject);
                    ImageReceiver imageReceiver = j9Var.f11644c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        j9Var.f11644c = null;
                    }
                    c9 c9Var = m9Var.f11806j0;
                    int i11 = messageObject.storyItem.f22617id;
                    m9 m9Var2 = c9Var.J0;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= c9Var.f12203t0.size()) {
                            break;
                        } else if (b10 == n6.b(m9Var2.K0.f(((Integer) ((ArrayList) c9Var.f12203t0.get(i12)).get(0)).intValue()))) {
                            if (m9Var2.N0) {
                                i10 = (c9Var.f12203t0.size() - 1) - i12;
                            } else {
                                i10 = i12;
                            }
                            int i13 = 0;
                            while (true) {
                                if (i13 < ((ArrayList) c9Var.f12203t0.get(i12)).size()) {
                                    if (((Integer) ((ArrayList) c9Var.f12203t0.get(i12)).get(i13)).intValue() == i11) {
                                        break;
                                    }
                                    i13++;
                                } else {
                                    i13 = 0;
                                    break;
                                }
                            }
                            if (c9Var.getCurrentPeerView() != null && c9Var.getCurrentItem() == i10) {
                                i4 currentPeerView = c9Var.getCurrentPeerView();
                                if (currentPeerView.F1 != i13) {
                                    currentPeerView.F1 = i13;
                                    currentPeerView.f1(false);
                                }
                            } else {
                                c9Var.x(i10, false);
                                i4 currentPeerView2 = c9Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    t7 t7Var = (t7) currentPeerView2.getParent();
                                    t7Var.a(true);
                                    if (c9Var.f12203t0 != null) {
                                        i4 i4Var = t7Var.f12169a;
                                        long j10 = t7Var.f12170b;
                                        ArrayList arrayList = t7Var.f12171c;
                                        i4Var.f11604x1 = j10;
                                        i4Var.f11596v1 = arrayList;
                                        i4Var.o0(i13);
                                    } else {
                                        t7Var.f12169a.U0(i13, t7Var.f12170b);
                                    }
                                }
                            }
                        } else {
                            i12++;
                        }
                    }
                } else if (t10 != null && t10.F1 != (closestPosition = h5Var.getClosestPosition())) {
                    t10.F1 = closestPosition;
                    t10.f1(false);
                }
                h5Var.d.abortAnimation();
                ValueAnimator valueAnimator = h5Var.I;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    h5Var.I = null;
                }
                h5Var.c(h5Var.G, false, true);
            }
            if (t10 != null) {
                l3 l3Var = t10.Y0;
                h5Var.f11756a = l3Var.getTop();
                h5Var.f11757b = l3Var.getMeasuredWidth();
                h5Var.f11758c = l3Var.getMeasuredHeight();
            }
            h5Var.setProgressToOpen(this.f11894f);
            i5 i5Var = this.A;
            if (i5Var.f11615s0 && this.f11894f != 1.0f) {
                i5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f11894f == 0.0f) {
                i9 = 4;
            } else {
                i9 = 0;
            }
            setVisibility(i9);
            if (this.f11894f != 1.0f) {
                i5Var.f11615s0 = false;
            }
        }
    }
}
