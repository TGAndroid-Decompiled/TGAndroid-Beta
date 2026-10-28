package di;

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
import org.telegram.ui.Components.kb1;
public final class b6 extends FrameLayout {
    public final v5 E;
    public final ArrayList F;
    public final ArrayList G;
    public final e5 H;
    public float I;
    public final y5 f8426a;
    public float f8427b;
    public float f8428c;
    public float d;
    public final z5 e;
    public float f8429f;
    public final u5 h;
    public float f8430n;
    public final y9 f8431r;
    public final Drawable f8432s;
    public float v;
    public boolean f8433w;
    public int f8434x;
    public long f8435y;

    public b6(Context context, y9 y9Var) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new e5();
        b bVar = y9Var.f9469y;
        this.f8431r = y9Var;
        u5 u5Var = new u5(getContext(), this, y9Var);
        this.h = u5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f8432s = mutate;
        org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.f23428h5, bVar, PorterDuff.Mode.MULTIPLY);
        z5 z5Var = new z5(this, context);
        this.e = z5Var;
        v5 v5Var = new v5(this, context);
        this.E = v5Var;
        v5Var.b(new w5(0, this));
        y5 y5Var = new y5(context, this, y9Var);
        this.f8426a = y5Var;
        v5Var.setAdapter(y5Var);
        z5Var.addView(v5Var, kb1.h(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(u5Var, kb1.g(-1.0f, -1));
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
        this.f8435y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f8373a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList F = MessagesController.getInstance(this.f8431r.h).storiesController.F(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (F != null) {
            for (int i12 = 0; i12 < F.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f8374b = (g7) F.get(i12);
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
            u5Var.f9304w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((v4) arrayList3.get(i13)).a(((v4) arrayList3.get(i13)).f9253b);
        }
        v5 v5Var = this.E;
        v5Var.setAdapter(null);
        y5 y5Var = this.f8426a;
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
                return ((a6) arrayList.get(closestPosition)).f8373a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f8431r.f9418b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        u5 u5Var = this.h;
        ((FrameLayout.LayoutParams) u5Var.getLayoutParams()).topMargin = i12;
        this.f8430n = u5Var.getFinalHeight();
        this.f8427b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f8430n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f8428c = size - dp;
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
        if (this.f8434x >= AndroidUtilities.dp(20.0f)) {
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
            ofFloat.addUpdateListener(new ai.g0(this, 21));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22964w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f8434x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f9195r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f9192c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.A((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.q1.f22964w);
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
            float f10 = this.f8429f;
            float clamp = Utilities.clamp(f7 / this.f8428c, 1.0f, 0.0f);
            this.f8429f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            y9 y9Var = this.f8431r;
            q4 u10 = y9Var.u();
            v9 v9Var = y9Var.f9456s0;
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            u5 u5Var = this.h;
            if (i12 == 0 && this.f8429f != 1.0f) {
                if (y9Var.O0 != null) {
                    MessageObject messageObject = (MessageObject) y9Var.O0.f9492i.get(Utilities.clamp(u5Var.getClosestPosition(), y9Var.O0.f9492i.size() - 1, 0));
                    long b10 = z6.b(messageObject);
                    ImageReceiver imageReceiver = v9Var.f9270c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        v9Var.f9270c = null;
                    }
                    o9 o9Var = y9Var.f9444n0;
                    int i13 = messageObject.storyItem.f22267id;
                    y9 y9Var2 = o9Var.N0;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= o9Var.f8563x0.size()) {
                            break;
                        } else if (b10 == z6.b(y9Var2.O0.f(((Integer) ((ArrayList) o9Var.f8563x0.get(i14)).get(0)).intValue()))) {
                            if (y9Var2.R0) {
                                i11 = (o9Var.f8563x0.size() - 1) - i14;
                            } else {
                                i11 = i14;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < ((ArrayList) o9Var.f8563x0.get(i14)).size()) {
                                    if (((Integer) ((ArrayList) o9Var.f8563x0.get(i14)).get(i15)).intValue() == i13) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    i15 = 0;
                                    break;
                                }
                            }
                            if (o9Var.getCurrentPeerView() != null && o9Var.getCurrentItem() == i11) {
                                q4 currentPeerView = o9Var.getCurrentPeerView();
                                if (currentPeerView.f9047y1 != i15) {
                                    currentPeerView.f9047y1 = i15;
                                    currentPeerView.d1(false);
                                }
                            } else {
                                o9Var.x(i11, false);
                                q4 currentPeerView2 = o9Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    e8 e8Var = (e8) currentPeerView2.getParent();
                                    e8Var.a(true);
                                    if (o9Var.f8563x0 != null) {
                                        q4 q4Var = e8Var.f8525a;
                                        long j10 = e8Var.f8526b;
                                        ArrayList arrayList = e8Var.f8527c;
                                        q4Var.f9015q1 = j10;
                                        q4Var.f9007o1 = arrayList;
                                        q4Var.m0(i15);
                                    } else {
                                        e8Var.f8525a.S0(i15, e8Var.f8526b);
                                    }
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                } else if (u10 != null && u10.f9047y1 != (closestPosition = u5Var.getClosestPosition())) {
                    u10.f9047y1 = closestPosition;
                    u10.d1(false);
                }
                u5Var.d.abortAnimation();
                ValueAnimator valueAnimator = u5Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    u5Var.M = null;
                }
                u5Var.c(u5Var.K, false, true);
            }
            if (u10 != null) {
                q3 q3Var = u10.R0;
                u5Var.f9297a = q3Var.getTop();
                u5Var.f9298b = q3Var.getMeasuredWidth();
                u5Var.f9299c = q3Var.getMeasuredHeight();
            }
            u5Var.setProgressToOpen(this.f8429f);
            v5 v5Var = this.E;
            if (v5Var.f9256w0 && this.f8429f != 1.0f) {
                v5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f8429f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f8429f != 1.0f) {
                v5Var.f9256w0 = false;
            }
        }
    }
}
