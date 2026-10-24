package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
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
public final class b6 extends FrameLayout {
    public final v5 E;
    public final ArrayList F;
    public final ArrayList G;
    public final e5 H;
    public float I;
    public final y5 f5178a;
    public float f5179b;
    public float f5180c;
    public float d;
    public final z5 e;
    public float f5181f;
    public final u5 h;
    public float f5182n;
    public final z9 f5183r;
    public final Drawable f5184s;
    public float v;
    public boolean f5185w;
    public int f5186x;
    public long f5187y;

    public b6(Context context, z9 z9Var) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new e5();
        b bVar = z9Var.f6274y;
        this.f5183r = z9Var;
        u5 u5Var = new u5(getContext(), this, z9Var);
        this.h = u5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f5184s = mutate;
        org.telegram.ui.ActionBar.r6.z(this, mutate, org.telegram.ui.ActionBar.k6.f21255h5, bVar, PorterDuff.Mode.MULTIPLY);
        z5 z5Var = new z5(this, context);
        this.e = z5Var;
        v5 v5Var = new v5(this, context);
        this.E = v5Var;
        v5Var.b(new w5(this, 0));
        y5 y5Var = new y5(context, this, z9Var);
        this.f5178a = y5Var;
        v5Var.setAdapter(y5Var);
        z5Var.addView(v5Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(u5Var, w7.z5.c(-1.0f, -1));
        addView(z5Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f7 = this.d;
        t5 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f7;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.f5187y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f5150a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f5183r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f5151b = (g7) E.get(i12);
                arrayList2.add(obj2);
            }
        }
        u5 u5Var = this.h;
        ArrayList arrayList3 = u5Var.G;
        ArrayList arrayList4 = u5Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        u5Var.d();
        if (u5Var.getMeasuredHeight() > 0) {
            u5Var.c(i10, false, false);
        } else {
            u5Var.f6058w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((v4) arrayList3.get(i13)).a(((v4) arrayList3.get(i13)).f6017b);
        }
        v5 v5Var = this.E;
        v5Var.setAdapter(null);
        y5 y5Var = this.f5178a;
        v5Var.setAdapter(y5Var);
        y5Var.g();
        v5Var.setCurrentItem(i10);
    }

    public v4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public t5 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                if (((Integer) ((t5) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                    return (t5) arrayList.get(i10);
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
            ArrayList arrayList = this.F;
            if (closestPosition < arrayList.size()) {
                return ((a6) arrayList.get(closestPosition)).f5150a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f5183r.f6223b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        u5 u5Var = this.h;
        ((FrameLayout.LayoutParams) u5Var.getLayoutParams()).topMargin = i12;
        this.f5182n = u5Var.getFinalHeight();
        this.f5179b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f5182n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f5180c = size - dp;
        while (true) {
            ArrayList arrayList = this.G;
            if (i13 < arrayList.size()) {
                ((t5) arrayList.get(i13)).setListBottomPadding(this.d);
                i13++;
            } else {
                super.onMeasure(i10, i11);
                return;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        boolean z10;
        boolean z11;
        t5 currentPage;
        float f7;
        if (this.f5186x >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            float f10 = this.I;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            ofFloat.addUpdateListener(new ah.c0(this, 19));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21718w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f5186x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f5958r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f5955c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.A((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.o1.f21718w);
            }
        }
    }

    public void setOffset(float f7) {
        int i10;
        int closestPosition;
        int i11;
        if (this.v != f7) {
            this.v = f7;
            this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
            float f10 = this.f5181f;
            float clamp = Utilities.clamp(f7 / this.f5180c, 1.0f, 0.0f);
            this.f5181f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            z9 z9Var = this.f5183r;
            p4 t10 = z9Var.t();
            w9 w9Var = z9Var.f6261s0;
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            u5 u5Var = this.h;
            if (i12 == 0 && this.f5181f != 1.0f) {
                if (z9Var.O0 != null) {
                    MessageObject messageObject = (MessageObject) z9Var.O0.f6193i.get(Utilities.clamp(u5Var.getClosestPosition(), z9Var.O0.f6193i.size() - 1, 0));
                    long b10 = z6.b(messageObject);
                    ImageReceiver imageReceiver = w9Var.f6069c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        w9Var.f6069c = null;
                    }
                    p9 p9Var = z9Var.f6249n0;
                    int i13 = messageObject.storyItem.f20578id;
                    z9 z9Var2 = p9Var.N0;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= p9Var.f5422x0.size()) {
                            break;
                        } else if (b10 == z6.b(z9Var2.O0.f(((Integer) ((ArrayList) p9Var.f5422x0.get(i14)).get(0)).intValue()))) {
                            if (z9Var2.R0) {
                                i11 = (p9Var.f5422x0.size() - 1) - i14;
                            } else {
                                i11 = i14;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < ((ArrayList) p9Var.f5422x0.get(i14)).size()) {
                                    if (((Integer) ((ArrayList) p9Var.f5422x0.get(i14)).get(i15)).intValue() == i13) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    i15 = 0;
                                    break;
                                }
                            }
                            if (p9Var.getCurrentPeerView() != null && p9Var.getCurrentItem() == i11) {
                                p4 currentPeerView = p9Var.getCurrentPeerView();
                                if (currentPeerView.J1 != i15) {
                                    currentPeerView.J1 = i15;
                                    currentPeerView.e1(false);
                                }
                            } else {
                                p9Var.x(i11, false);
                                p4 currentPeerView2 = p9Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    g8 g8Var = (g8) currentPeerView2.getParent();
                                    g8Var.a(true);
                                    if (p9Var.f5422x0 != null) {
                                        p4 p4Var = g8Var.f5374a;
                                        long j10 = g8Var.f5375b;
                                        ArrayList arrayList = g8Var.f5376c;
                                        p4Var.B1 = j10;
                                        p4Var.f5729z1 = arrayList;
                                        p4Var.n0(i15);
                                    } else {
                                        g8Var.f5374a.T0(i15, g8Var.f5375b);
                                    }
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                } else if (t10 != null && t10.J1 != (closestPosition = u5Var.getClosestPosition())) {
                    t10.J1 = closestPosition;
                    t10.e1(false);
                }
                u5Var.d.abortAnimation();
                ValueAnimator valueAnimator = u5Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    u5Var.M = null;
                }
                u5Var.c(u5Var.K, false, true);
            }
            if (t10 != null) {
                q3 q3Var = t10.f5656c1;
                u5Var.f6051a = q3Var.getTop();
                u5Var.f6052b = q3Var.getMeasuredWidth();
                u5Var.f6053c = q3Var.getMeasuredHeight();
            }
            u5Var.setProgressToOpen(this.f5181f);
            v5 v5Var = this.E;
            if (v5Var.f6020w0 && this.f5181f != 1.0f) {
                v5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f5181f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f5181f != 1.0f) {
                v5Var.f6020w0 = false;
            }
        }
    }
}
