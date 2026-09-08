package bi;

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
public final class a7 extends FrameLayout {
    public final u6 E;
    public final ArrayList F;
    public final ArrayList G;
    public final d6 H;
    public float I;
    public final x6 f2788a;
    public float f2789b;
    public float f2790c;
    public float d;
    public final y6 f2791e;
    public float f2792f;
    public final t6 h;
    public float f2793n;
    public final pb f2794r;
    public final Drawable f2795s;
    public float v;
    public boolean f2796w;
    public int f2797x;
    public long f2798y;

    public a7(Context context, pb pbVar) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new d6();
        b bVar = pbVar.f3613y;
        this.f2794r = pbVar;
        t6 t6Var = new t6(getContext(), this, pbVar);
        this.h = t6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f2795s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, bVar), PorterDuff.Mode.MULTIPLY));
        y6 y6Var = new y6(this, context);
        this.f2791e = y6Var;
        u6 u6Var = new u6(this, context);
        this.E = u6Var;
        u6Var.b(new v6(0, this));
        x6 x6Var = new x6(context, this, pbVar);
        this.f2788a = x6Var;
        u6Var.setAdapter(x6Var);
        y6Var.addView(u6Var, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(t6Var, w7.x5.c(-1.0f, -1));
        addView(y6Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f7 = this.d;
        s6 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f7;
    }

    public final void b(int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.f2798y = j3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f4087a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f2794r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f4088b = (t8) E.get(i12);
                arrayList2.add(obj2);
            }
        }
        t6 t6Var = this.h;
        ArrayList arrayList3 = t6Var.G;
        ArrayList arrayList4 = t6Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        t6Var.d();
        if (t6Var.getMeasuredHeight() > 0) {
            t6Var.c(i10, false, false);
        } else {
            t6Var.f3981w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((v5) arrayList3.get(i13)).a(((v5) arrayList3.get(i13)).f3923b);
        }
        u6 u6Var = this.E;
        u6Var.setAdapter(null);
        x6 x6Var = this.f2788a;
        u6Var.setAdapter(x6Var);
        x6Var.g();
        u6Var.setCurrentItem(i10);
    }

    public v5 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public s6 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                if (((Integer) ((s6) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                    return (s6) arrayList.get(i10);
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
                return ((z6) arrayList.get(closestPosition)).f4087a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f2794r.f3561b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        t6 t6Var = this.h;
        ((FrameLayout.LayoutParams) t6Var.getLayoutParams()).topMargin = i12;
        this.f2793n = t6Var.getFinalHeight();
        this.f2789b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.f2791e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f2793n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f2790c = size - dp;
        while (true) {
            ArrayList arrayList = this.G;
            if (i13 < arrayList.size()) {
                ((s6) arrayList.get(i13)).setListBottomPadding(this.d);
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
        s6 currentPage;
        float f7;
        if (this.f2797x >= AndroidUtilities.dp(20.0f)) {
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
            ofFloat.addUpdateListener(new ah.d0(this, 12));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21302w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f2797x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f3723r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f3719c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.v((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.p1.f21302w);
            }
        }
    }

    public void setOffset(float f7) {
        int i10;
        int closestPosition;
        int i11;
        if (this.v != f7) {
            this.v = f7;
            this.f2791e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
            float f10 = this.f2792f;
            float clamp = Utilities.clamp(f7 / this.f2790c, 1.0f, 0.0f);
            this.f2792f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            pb pbVar = this.f2794r;
            o5 t10 = pbVar.t();
            mb mbVar = pbVar.f3600s0;
            t6 t6Var = this.h;
            if (f10 == 1.0f && this.f2792f != 1.0f) {
                if (pbVar.O0 != null) {
                    MessageObject messageObject = (MessageObject) pbVar.O0.f3302i.get(Utilities.clamp(t6Var.getClosestPosition(), pbVar.O0.f3302i.size() - 1, 0));
                    long b10 = l8.b(messageObject);
                    ImageReceiver imageReceiver = mbVar.f3362c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        mbVar.f3362c = null;
                    }
                    fb fbVar = pbVar.f3588n0;
                    int i12 = messageObject.storyItem.f20134id;
                    pb pbVar2 = fbVar.N0;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= fbVar.f3856x0.size()) {
                            break;
                        } else if (b10 == l8.b(pbVar2.O0.f(((Integer) ((ArrayList) fbVar.f3856x0.get(i13)).get(0)).intValue()))) {
                            if (pbVar2.R0) {
                                i11 = (fbVar.f3856x0.size() - 1) - i13;
                            } else {
                                i11 = i13;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < ((ArrayList) fbVar.f3856x0.get(i13)).size()) {
                                    if (((Integer) ((ArrayList) fbVar.f3856x0.get(i13)).get(i14)).intValue() == i12) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i14 = 0;
                                    break;
                                }
                            }
                            if (fbVar.getCurrentPeerView() != null && fbVar.getCurrentItem() == i11) {
                                o5 currentPeerView = fbVar.getCurrentPeerView();
                                if (currentPeerView.J1 != i14) {
                                    currentPeerView.J1 = i14;
                                    currentPeerView.f1(false);
                                }
                            } else {
                                fbVar.x(i11, false);
                                o5 currentPeerView2 = fbVar.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    t9 t9Var = (t9) currentPeerView2.getParent();
                                    t9Var.a(true);
                                    if (fbVar.f3856x0 != null) {
                                        o5 o5Var = t9Var.f3776a;
                                        long j3 = t9Var.f3777b;
                                        ArrayList arrayList = t9Var.f3778c;
                                        o5Var.B1 = j3;
                                        o5Var.f3508z1 = arrayList;
                                        o5Var.o0(i14);
                                    } else {
                                        t9Var.f3776a.U0(i14, t9Var.f3777b);
                                    }
                                }
                            }
                        } else {
                            i13++;
                        }
                    }
                } else if (t10 != null && t10.J1 != (closestPosition = t6Var.getClosestPosition())) {
                    t10.J1 = closestPosition;
                    t10.f1(false);
                }
                t6Var.d.abortAnimation();
                ValueAnimator valueAnimator = t6Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    t6Var.M = null;
                }
                t6Var.c(t6Var.K, false, true);
            }
            if (t10 != null) {
                l4 l4Var = t10.f3436c1;
                t6Var.f3973a = l4Var.getTop();
                t6Var.f3974b = l4Var.getMeasuredWidth();
                t6Var.f3975c = l4Var.getMeasuredHeight();
            }
            t6Var.setProgressToOpen(this.f2792f);
            u6 u6Var = this.E;
            if (u6Var.f3824w0 && this.f2792f != 1.0f) {
                u6Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f2792f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f2792f != 1.0f) {
                u6Var.f3824w0 = false;
            }
        }
    }
}
