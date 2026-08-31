package oh;

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
public final class n5 extends FrameLayout {
    public final h5 B;
    public final ArrayList C;
    public final ArrayList D;
    public final q4 E;
    public float F;
    public final k5 f17487a;
    public float f17488b;
    public float f17489c;
    public float d;
    public final l5 f17490e;
    public float f17491f;
    public final g5 h;
    public float f17492n;
    public final i9 f17493r;
    public final Drawable f17494s;
    public float v;
    public boolean f17495w;
    public int f17496x;
    public long f17497y;

    public n5(Context context, i9 i9Var) {
        super(context);
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new q4();
        b bVar = i9Var.f17304y;
        this.f17493r = i9Var;
        g5 g5Var = new g5(getContext(), this, i9Var);
        this.h = g5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f17494s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, bVar), PorterDuff.Mode.MULTIPLY));
        l5 l5Var = new l5(this, context);
        this.f17490e = l5Var;
        h5 h5Var = new h5(this, context);
        this.B = h5Var;
        h5Var.b(new i5(0, this));
        k5 k5Var = new k5(context, this, i9Var);
        this.f17487a = k5Var;
        h5Var.setAdapter(k5Var);
        l5Var.addView(h5Var, k7.c6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(g5Var, k7.c6.c(-1.0f, -1));
        addView(l5Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f10 = this.d;
        e5 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f10;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.C;
        arrayList2.clear();
        this.f17497y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f17437a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f17493r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f17438b = (s6) E.get(i12);
                arrayList2.add(obj2);
            }
        }
        g5 g5Var = this.h;
        ArrayList arrayList3 = g5Var.D;
        ArrayList arrayList4 = g5Var.B;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        g5Var.d();
        if (g5Var.getMeasuredHeight() > 0) {
            g5Var.c(i10, false, false);
        } else {
            g5Var.f17358w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((j4) arrayList3.get(i13)).a(((j4) arrayList3.get(i13)).f17331b);
        }
        h5 h5Var = this.B;
        h5Var.setAdapter(null);
        k5 k5Var = this.f17487a;
        h5Var.setAdapter(k5Var);
        k5Var.g();
        h5Var.setCurrentItem(i10);
    }

    public j4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public e5 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 < arrayList.size()) {
                if (((Integer) ((e5) arrayList.get(i10)).getTag()).intValue() == this.B.getCurrentItem()) {
                    return (e5) arrayList.get(i10);
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
                return ((m5) arrayList.get(closestPosition)).f17437a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f17493r.f17255b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        g5 g5Var = this.h;
        ((FrameLayout.LayoutParams) g5Var.getLayoutParams()).topMargin = i12;
        this.f17492n = g5Var.getFinalHeight();
        this.f17488b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.f17490e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f17492n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f17489c = size - dp;
        while (true) {
            ArrayList arrayList = this.D;
            if (i13 < arrayList.size()) {
                ((e5) arrayList.get(i13)).setListBottomPadding(this.d);
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
        e5 currentPage;
        float f10;
        if (this.f17496x >= AndroidUtilities.dp(20.0f)) {
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
            ofFloat.addUpdateListener(new f5(this, 0));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f17496x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f17031r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f17027c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.z((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.r1.f22249w);
            }
        }
    }

    public void setOffset(float f10) {
        int i10;
        int closestPosition;
        int i11;
        if (this.v != f10) {
            this.v = f10;
            this.f17490e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
            float f11 = this.f17491f;
            float clamp = Utilities.clamp(f10 / this.f17489c, 1.0f, 0.0f);
            this.f17491f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            i9 i9Var = this.f17493r;
            f4 t6 = i9Var.t();
            f9 f9Var = i9Var.f17286p0;
            g5 g5Var = this.h;
            if (f11 == 1.0f && this.f17491f != 1.0f) {
                if (i9Var.L0 != null) {
                    MessageObject messageObject = (MessageObject) i9Var.L0.f17402i.get(Utilities.clamp(g5Var.getClosestPosition(), i9Var.L0.f17402i.size() - 1, 0));
                    long b10 = l6.b(messageObject);
                    ImageReceiver imageReceiver = f9Var.f17146c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        f9Var.f17146c = null;
                    }
                    y8 y8Var = i9Var.f17277k0;
                    int i12 = messageObject.storyItem.f21080id;
                    i9 i9Var2 = y8Var.K0;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= y8Var.f17694u0.size()) {
                            break;
                        } else if (b10 == l6.b(i9Var2.L0.f(((Integer) ((ArrayList) y8Var.f17694u0.get(i13)).get(0)).intValue()))) {
                            if (i9Var2.O0) {
                                i11 = (y8Var.f17694u0.size() - 1) - i13;
                            } else {
                                i11 = i13;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < ((ArrayList) y8Var.f17694u0.get(i13)).size()) {
                                    if (((Integer) ((ArrayList) y8Var.f17694u0.get(i13)).get(i14)).intValue() == i12) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i14 = 0;
                                    break;
                                }
                            }
                            if (y8Var.getCurrentPeerView() != null && y8Var.getCurrentItem() == i11) {
                                f4 currentPeerView = y8Var.getCurrentPeerView();
                                if (currentPeerView.G1 != i14) {
                                    currentPeerView.G1 = i14;
                                    currentPeerView.f1(false);
                                }
                            } else {
                                y8Var.x(i11, false);
                                f4 currentPeerView2 = y8Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    q7 q7Var = (q7) currentPeerView2.getParent();
                                    q7Var.a(true);
                                    if (y8Var.f17694u0 != null) {
                                        f4 f4Var = q7Var.f17662a;
                                        long j10 = q7Var.f17663b;
                                        ArrayList arrayList = q7Var.f17664c;
                                        f4Var.f17128y1 = j10;
                                        f4Var.f17120w1 = arrayList;
                                        f4Var.o0(i14);
                                    } else {
                                        q7Var.f17662a.U0(i14, q7Var.f17663b);
                                    }
                                }
                            }
                        } else {
                            i13++;
                        }
                    }
                } else if (t6 != null && t6.G1 != (closestPosition = g5Var.getClosestPosition())) {
                    t6.G1 = closestPosition;
                    t6.f1(false);
                }
                g5Var.d.abortAnimation();
                ValueAnimator valueAnimator = g5Var.J;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    g5Var.J = null;
                }
                g5Var.c(g5Var.H, false, true);
            }
            if (t6 != null) {
                j3 j3Var = t6.Z0;
                g5Var.f17350a = j3Var.getTop();
                g5Var.f17351b = j3Var.getMeasuredWidth();
                g5Var.f17352c = j3Var.getMeasuredHeight();
            }
            g5Var.setProgressToOpen(this.f17491f);
            h5 h5Var = this.B;
            if (h5Var.f17181t0 && this.f17491f != 1.0f) {
                h5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f17491f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f17491f != 1.0f) {
                h5Var.f17181t0 = false;
            }
        }
    }
}
