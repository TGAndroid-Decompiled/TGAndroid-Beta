package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class ru3 extends e {
    public nu3 E;
    public ou3 a;
    public d79 b;
    public lu5 c;
    public ImageView d;
    public final ArrayList e;
    public qu3 f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final int x;
    public final int y;

    public ru3(int i, int i2) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.x = i;
        this.y = i2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().n0(i2, i, arrayList, arrayList2, arrayList3, true);
        getMessagesController().j4(arrayList2, true);
        getMessagesController().c4(arrayList3, true);
        d0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final void b0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        hl.d3(new zg3(this, (byte) 20), 1000L);
    }

    public final void c0(Context context, int i) {
        kt5 kt5Var;
        boolean z;
        int i2;
        int d;
        Object X1;
        if (i == this.h) {
            lt5 lt5Var = new lt5(context, this.currentAccount, null, 0L, this, null);
            int i3 = 0;
            lt5Var.g2 = new lu3(this, (byte) 0);
            jn7.f(lt5Var.a).b(lt5Var, jn7.r);
            lt5Var.h2 = new ArrayList(uc7.s1(lt5Var.a).F);
            lt5Var.P0();
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                kt5Var = lt5Var.O1;
                if (i4 >= size) {
                    break;
                }
                Long l = (Long) arrayList.get(i4);
                long longValue = l.longValue();
                boolean y = wf3.y(longValue);
                int i5 = lt5Var.a;
                if (y) {
                    X1 = uc7.s1(i5).M0(Long.valueOf(-longValue));
                } else {
                    X1 = uc7.s1(i5).X1(l);
                }
                zc5 zc5Var = new zc5(kt5Var.getContext(), X1);
                kt5Var.a(zc5Var, false);
                zc5Var.setOnClickListener(lt5Var.l2);
                i4++;
            }
            lt5Var.O0(false);
            int childCount = kt5Var.getChildCount();
            Point point = hl.q;
            if (point.x < point.y) {
                z = true;
            } else {
                z = false;
            }
            if (!hl.O1() && !z) {
                lt5Var.m2 = hl.L(56.0f);
            } else {
                lt5Var.m2 = hl.L(144.0f);
            }
            boolean O1 = hl.O1();
            int i6 = point.x;
            if (O1) {
                i2 = (int) (Math.min(i6, point.y) * 0.8f);
            } else {
                if (!z) {
                    i6 = (int) Math.max(i6 * 0.8f, Math.min(hl.L(480.0f), point.x));
                }
                i2 = i6;
            }
            int L = i2 - hl.L(26.0f);
            int L2 = hl.L(10.0f);
            int i7 = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = kt5Var.getChildAt(i8);
                if (childAt instanceof zc5) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), 1073741824));
                    if (childAt.getMeasuredWidth() + i7 > L) {
                        L2 = uh9.w(8.0f, childAt.getMeasuredHeight(), L2);
                        i7 = 0;
                    }
                    i7 = uh9.w(9.0f, childAt.getMeasuredWidth(), i7);
                }
            }
            int L3 = hl.L(42.0f) + L2;
            if (lt5Var.g2 != null) {
                if (lt5Var.a2) {
                    d = Math.min(lt5Var.m2, L3);
                } else {
                    d = 0;
                }
            } else {
                d = c00.d(52.0f, Math.min(lt5Var.m2, L3), 0);
            }
            int i9 = lt5Var.o2;
            if (lt5Var.Z1.m() > 0) {
                i3 = hl.L(56.0f);
            }
            lt5Var.o2 = i3;
            if (d != lt5Var.i2 || i9 != i3) {
                lt5Var.i2 = d;
            }
            showDialog(lt5Var);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(false);
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        a aVar = this.actionBar;
        if (this.x == 0) {
            aVar.setTitle(ob6.M0(2131742508, null));
        } else {
            aVar.setTitle(ob6.M0(2131742499, null));
        }
        this.actionBar.u().e(1, ob6.M0(2131751319, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 14));
        this.a = new ou3(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        yob.h(aob.a7, null, frameLayout);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.setLayoutManager(new x46(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((zb3) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        lu5 lu5Var = new lu5(new pu3(this));
        this.c = lu5Var;
        lu5Var.h(this.b);
        this.b.setOnItemClickListener(new l0(this, context, (byte) 12));
        this.b.setOnItemLongClickListener(new qx6(this));
        return this.fragmentView;
    }

    public final void d0() {
        this.w = 2;
        this.h = true;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i = this.w;
            this.n = i;
            int size = arrayList.size() + i;
            this.w = size;
            this.r = size;
        }
        int i2 = this.w;
        this.w = i2 + 1;
        this.s = i2;
        ou3 ou3Var = this.a;
        if (ou3Var != null) {
            ou3Var.f();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G8));
        arrayList.add(new apb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.E8));
        arrayList.add(new apb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.F8));
        int i = aob.q6;
        arrayList.add(new apb(this.b, 0, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.b, 0, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.E == null) {
            if (z) {
                b0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        uj3.x4(k5.a(this.currentAccount));
        getMediaDataController().O0(true);
        return super.onFragmentCreate();
    }
}
