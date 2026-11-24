package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.RadialProgress2;
public class sp8 extends lh2 implements gk7 {
    public final a A0;
    public boolean B0;
    public boolean C0;
    public final o39 D0;
    public final rp8 E0;
    public long F0;
    public TLRPC.ChatFull G0;
    public final op8 H0;
    public boolean I0;
    public boolean J0;
    public final boolean K0;
    public gl5 L0;
    public final int M0;
    public final Path N0;
    public final RectF O0;
    public final float[] P0;
    public gl5 Q0;
    public gl5 R0;
    public i9c S0;
    public w97 T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public final ArrayList Y0;
    public final ArrayList Z0;
    public final ArrayList a1;
    public final ArrayList b1;
    public final ArrayList c1;
    public int d1;
    public final SparseArray e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public ma8 i1;
    public boolean j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public int p1;
    public kp8 q1;
    public gl5 r1;
    public gl5 s1;
    public final PointF y0;
    public final int z0;

    public sp8(Context context, long j, a aVar, om8 om8Var, xm8 xm8Var, op8 op8Var, kp8 kp8Var) {
        super(context);
        int i;
        this.y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i2 = y6c.t0;
        this.M0 = i2;
        this.N0 = new Path();
        this.O0 = new RectF();
        this.P0 = new float[8];
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.c1 = new ArrayList();
        this.e1 = new SparseArray();
        this.f1 = true;
        this.k1 = -1;
        this.l1 = -1;
        this.q1 = kp8Var;
        if (kp8Var == null) {
            i = 0;
        } else {
            i = kp8Var.n;
        }
        setPadding(0, 0, 0, i);
        if (kp8Var != null) {
            kp8Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.K0 = true;
        this.F0 = j;
        this.D0 = om8Var;
        this.A0 = aVar;
        rp8 rp8Var = new rp8(this, getContext(), xm8Var);
        this.E0 = rp8Var;
        setAdapter((kh2) rp8Var);
        this.z0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.H0 = op8Var;
        b(new mp8((ym8) this));
        kk7.f(i2).b(this, kk7.a0);
        kk7.f(i2).b(this, kk7.X1);
        kk7.f(i2).b(this, kk7.W1);
        kk7.f(i2).b(this, kk7.b0);
        kk7.f(i2).b(this, kk7.f3);
        w97 S0 = na7.q1(i2).S0(j);
        this.T0 = S0;
        S0.h.getMessagesStorage().a.c(new u97(S0, (byte) 0));
    }

    public final void A(gl5 gl5Var, gl5 gl5Var2) {
        this.Q0 = gl5Var;
        this.V0.add(0, null);
        this.U0.add(0, null);
        this.Y0.add(0, gl5Var);
        this.Z0.add(0, gl5Var2);
        this.a1.add(0, null);
        this.X0.add(0, null);
        this.W0.add(0, null);
        this.b1.add(0, -1);
        this.c1.add(0, Float.valueOf(0.0f));
        this.E0.g();
        L();
        this.r1 = gl5Var;
        this.s1 = gl5Var2;
    }

    public final void B(float f, int i) {
        float f2;
        int i2 = this.k1;
        float f3 = 0.0f;
        if (i2 >= 0 || this.l1 >= 0) {
            if (i2 < 0) {
                i2 = this.l1;
            }
            int k = this.E0.k(i);
            if (this.j1) {
                k--;
            }
            if (k == i2) {
                f2 = 1.0f - f;
            } else if (getRealCount() > 0 && (k - 1) % getRealCount() == i2) {
                f2 = (1.0f - f) - 1.0f;
            } else if (getRealCount() > 0 && (k + 1) % getRealCount() == i2) {
                f2 = (1.0f - f) + 1.0f;
            } else {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 2.0f - f2;
            }
            f3 = Utilities.i(f2, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f3);
    }

    public final gl5 C(gl5 gl5Var, gl5 gl5Var2) {
        ArrayList arrayList;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (gl5Var == null) {
            return null;
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                arrayList = this.Z0;
            } else {
                arrayList = this.Y0;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                gl5 gl5Var3 = (gl5) arrayList.get(i2);
                if (gl5Var3 != null && (tL_fileLocationToBeDeprecated = gl5Var3.f) != null) {
                    int i3 = gl5Var3.a;
                    if (i3 == gl5Var.a) {
                        int i4 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gl5Var.f;
                        if (i4 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (gl5) this.X0.get(i2);
                        }
                    }
                    if (i3 == gl5Var2.a) {
                        int i5 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = gl5Var2.f;
                        if (i5 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (gl5) this.X0.get(i2);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final gl5 D(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.Y0;
            if (i < arrayList.size()) {
                gl5 gl5Var = (gl5) this.X0.get(i);
                if (gl5Var != null) {
                    return gl5Var;
                }
                return (gl5) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    public final View E(int i) {
        rp8 rp8Var = this.E0;
        if (rp8Var != null) {
            ArrayList arrayList = rp8Var.c;
            if (arrayList.size() > i && i >= 0) {
                pp8 pp8Var = (pp8) arrayList.get(i);
                qp8 qp8Var = pp8Var.b;
                if (qp8Var == null) {
                    return pp8Var.c;
                }
                return qp8Var;
            }
            return null;
        }
        return null;
    }

    public final TLRPC.Photo F(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.W0;
            if (i < arrayList.size()) {
                return (TLRPC.Photo) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    public final gl5 G(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.Y0;
            if (i < arrayList.size()) {
                return (gl5) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    public final boolean H(i9c i9cVar, gl5 gl5Var, gl5 gl5Var2, boolean z) {
        w97 w97Var;
        int i;
        w97 w97Var2;
        int i2 = 0;
        if (gl5Var != null && gl5Var2 != null && this.d1 == 0) {
            gl5 gl5Var3 = this.Q0;
            ArrayList arrayList = this.Y0;
            if (gl5Var3 == null || gl5Var3.f.local_id != gl5Var.f.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                rp8 rp8Var = this.E0;
                if (!isEmpty) {
                    this.Q0 = gl5Var;
                    if (z && (w97Var2 = this.T0) != null) {
                        w97Var2.f();
                        w97 w97Var3 = this.T0;
                        int currentItem = getCurrentItem();
                        if (rp8Var != null) {
                            i2 = rp8Var.j();
                        }
                        w97Var3.b(currentItem - i2, true);
                    }
                    return true;
                } else if (z && (w97Var = this.T0) != null) {
                    w97Var.f();
                    w97 w97Var4 = this.T0;
                    int currentItem2 = getCurrentItem();
                    if (rp8Var != null) {
                        i = rp8Var.j();
                    } else {
                        i = 0;
                    }
                    w97Var4.b(currentItem2 - i, true);
                }
            }
            if (arrayList.isEmpty()) {
                this.Q0 = gl5Var;
                this.R0 = gl5Var2;
                this.S0 = i9cVar;
                this.V0.add(null);
                this.U0.add(null);
                arrayList.add(gl5Var);
                this.Z0.add(gl5Var2);
                this.a1.add(i9cVar);
                this.X0.add(null);
                this.W0.add(null);
                this.b1.add(-1);
                this.c1.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.j1) {
            if (realPosition != 0) {
                realPosition--;
            } else {
                return false;
            }
        }
        if (realPosition >= 0) {
            ArrayList arrayList = this.X0;
            if (realPosition < arrayList.size() && arrayList.get(realPosition) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean J() {
        int realPosition;
        be0 currentItemView;
        if (this.j1) {
            realPosition = getRealPosition() - 1;
        } else {
            realPosition = getRealPosition();
        }
        if (this.X0.get(realPosition) != null && (currentItemView = getCurrentItemView()) != null) {
            km m = currentItemView.getImageReceiver().m();
            if (m == null || !m.s()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K() {
        this.q1 = null;
        int i = this.M0;
        kk7.f(i).n(this, kk7.a0);
        kk7.f(i).n(this, kk7.X1);
        kk7 f = kk7.f(i);
        int i2 = kk7.W1;
        f.n(this, i2);
        kk7.f(i).n(this, i2);
        kk7.f(i).n(this, kk7.b0);
        kk7.f(i).n(this, kk7.f3);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof be0) {
                be0 be0Var = (be0) childAt;
                if (be0Var.getImageReceiver().n0 != null) {
                    Drawable t = be0Var.getImageReceiver().t();
                    if (t instanceof km) {
                        ((km) t).w(be0Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.E0.j(), false);
    }

    public final void M(long j, boolean z) {
        if (this.F0 == j && !z) {
            L();
            return;
        }
        this.g1 = true;
        this.U0.clear();
        this.V0.clear();
        this.W0.clear();
        this.X0.clear();
        this.Y0.clear();
        this.Z0.clear();
        this.b1.clear();
        this.c1.clear();
        this.E0.g();
        x(0, false);
        this.p1 = 0;
        this.L0 = null;
        this.Q0 = null;
        this.F0 = j;
        w97 S0 = na7.q1(this.M0).S0(j);
        this.T0 = S0;
        S0.h.getMessagesStorage().a.c(new u97(S0, (byte) 0));
    }

    public final void N(int i, int i2) {
        this.n1 = i;
        this.o1 = i2;
        rp8 rp8Var = this.E0;
        if (rp8Var != null) {
            ArrayList arrayList = rp8Var.c;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((pp8) arrayList.get(i3)).c != null) {
                    np8 np8Var = ((pp8) arrayList.get(i3)).c;
                    int i4 = this.n1;
                    int i5 = this.o1;
                    np8Var.s(i4, i4, i5, i5);
                }
            }
        }
    }

    public final void O(gl5 gl5Var, float f) {
        if (gl5Var != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.Y0;
                if (i >= arrayList.size()) {
                    break;
                } else if (arrayList.get(i) == gl5Var) {
                    this.c1.set(i, Float.valueOf(f));
                    SparseArray sparseArray = this.e1;
                    if (sparseArray.get(i) != null) {
                        ((RadialProgress2) sparseArray.get(i)).o(true, f);
                    }
                } else {
                    i++;
                }
            }
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                getChildAt(i2).invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        w97 w97Var;
        int i3;
        TLRPC.User user;
        ArrayList arrayList;
        gl5 gl5Var;
        int i4;
        boolean z;
        boolean z2;
        int i5;
        int i6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        gl5 gl5Var2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        TLRPC.PhotoSize photoSize;
        boolean z3;
        boolean z4;
        TLRPC.User user2;
        boolean z5;
        boolean z6;
        int i7;
        boolean z7;
        TLRPC.Photo photo;
        Integer num2 = -1;
        int i8 = kk7.f3;
        ArrayList arrayList5 = this.V0;
        ArrayList arrayList6 = this.U0;
        if (i == i8) {
            w97 w97Var2 = (w97) objArr[0];
            if (this.T0 == w97Var2) {
                ArrayList arrayList7 = new ArrayList(w97Var2.b);
                if (!arrayList7.isEmpty() || !w97Var2.c) {
                    this.k1 = -1;
                    this.l1 = -1;
                    int i9 = this.M0;
                    TLRPC.User V1 = na7.q1(i9).V1(Long.valueOf(this.F0));
                    TLRPC.UserFull W1 = na7.q1(i9).W1(this.F0);
                    if (W1 != null && (photo = W1.personal_photo) != null) {
                        arrayList7.add(0, photo);
                        this.k1 = 0;
                    }
                    if (V1 != null && V1.self && l7c.s(W1)) {
                        arrayList7.add(W1.fallback_photo);
                        this.l1 = arrayList7.size() - 1;
                    }
                    arrayList5.clear();
                    arrayList6.clear();
                    ArrayList arrayList8 = this.Y0;
                    arrayList8.clear();
                    ArrayList arrayList9 = this.X0;
                    arrayList9.clear();
                    ArrayList arrayList10 = this.Z0;
                    arrayList10.clear();
                    ArrayList arrayList11 = this.a1;
                    arrayList11.clear();
                    ArrayList arrayList12 = this.W0;
                    arrayList12.clear();
                    ArrayList arrayList13 = this.b1;
                    arrayList13.clear();
                    ArrayList arrayList14 = this.c1;
                    arrayList14.clear();
                    if (cf3.y(this.F0)) {
                        TLRPC.Chat K0 = na7.q1(i9).K0(Long.valueOf(-this.F0));
                        gl5Var = gl5.m(i9, 0, K0);
                        arrayList = arrayList8;
                        if (gl5Var != null) {
                            arrayList.add(gl5Var);
                            user = V1;
                            arrayList10.add(gl5.m(i9, 1, K0));
                            arrayList11.add(null);
                            arrayList5.add(null);
                            TLRPC.ChatFull chatFull = this.G0;
                            if (chatFull != null && ba4.U(gl5Var.f, chatFull.chat_photo)) {
                                arrayList12.add(this.G0.chat_photo);
                                if (!this.G0.chat_photo.video_sizes.isEmpty()) {
                                    TLRPC.VideoSize x = ba4.x(1000, this.G0.chat_photo.video_sizes);
                                    arrayList9.add(gl5.j(x, this.G0.chat_photo));
                                    z7 = false;
                                    arrayList6.add(ba4.r(null, x));
                                } else {
                                    z7 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                }
                            } else {
                                z7 = false;
                                arrayList12.add(null);
                                arrayList6.add(null);
                                arrayList9.add(null);
                            }
                            arrayList13.add(num2);
                            arrayList14.add(z7);
                        } else {
                            user = V1;
                        }
                    } else {
                        user = V1;
                        arrayList = arrayList8;
                        gl5Var = null;
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList7.size();
                        i4 = i9;
                        z = this.K0;
                        if (i10 >= size) {
                            break;
                        }
                        TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i10);
                        if (photo2 != null && !(photo2 instanceof TLRPC.TL_photoEmpty) && (arrayList4 = photo2.sizes) != null) {
                            i6 = i10;
                            arrayList2 = arrayList7;
                            ArrayList arrayList15 = arrayList14;
                            TLRPC.PhotoSize w = ba4.w(arrayList4, 50, false, null, false);
                            int size2 = photo2.sizes.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size2) {
                                    break;
                                }
                                TLRPC.PhotoSize photoSize2 = photo2.sizes.get(i11);
                                TLRPC.PhotoSize photoSize3 = w;
                                if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                    w = photoSize2;
                                    break;
                                } else {
                                    i11++;
                                    w = photoSize3;
                                }
                            }
                            if (gl5Var != null) {
                                int size3 = photo2.sizes.size();
                                int i12 = 0;
                                while (i12 < size3) {
                                    TLRPC.FileLocation fileLocation = photo2.sizes.get(i12).location;
                                    int i13 = size3;
                                    if (fileLocation != null) {
                                        int i14 = fileLocation.local_id;
                                        i7 = i12;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gl5Var.f;
                                        gl5Var2 = gl5Var;
                                        if (i14 == tL_fileLocationToBeDeprecated.local_id) {
                                            num = num2;
                                            if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                                arrayList12.set(0, photo2);
                                                if (!photo2.video_sizes.isEmpty()) {
                                                    arrayList9.set(0, gl5.j(ba4.x(1000, photo2.video_sizes), photo2));
                                                }
                                                arrayList3 = arrayList15;
                                            } else {
                                                i12 = i7 + 1;
                                                num2 = num;
                                                size3 = i13;
                                                gl5Var = gl5Var2;
                                            }
                                        }
                                    } else {
                                        i7 = i12;
                                        gl5Var2 = gl5Var;
                                    }
                                    num = num2;
                                    i12 = i7 + 1;
                                    num2 = num;
                                    size3 = i13;
                                    gl5Var = gl5Var2;
                                }
                            }
                            gl5Var2 = gl5Var;
                            num = num2;
                            TLRPC.PhotoSize w2 = ba4.w(photo2.sizes, 640, false, null, false);
                            if (w2 != null) {
                                int i15 = photo2.dc_id;
                                if (i15 != 0) {
                                    TLRPC.FileLocation fileLocation2 = w2.location;
                                    fileLocation2.dc_id = i15;
                                    fileLocation2.file_reference = photo2.file_reference;
                                }
                                gl5 i16 = gl5.i(w2, photo2);
                                if (i16 != null) {
                                    gl5 gl5Var3 = this.Q0;
                                    if (gl5Var3 != null && gl5Var3.s == i16.s && !z && this.F0 != y6c.h(i4).e()) {
                                        arrayList5.add(null);
                                        arrayList.add(this.Q0);
                                        gl5 gl5Var4 = this.R0;
                                        if (gl5Var4 == null) {
                                            gl5Var4 = gl5.i(w, photo2);
                                        }
                                        arrayList10.add(gl5Var4);
                                        if (!photo2.video_sizes.isEmpty()) {
                                            TLRPC.VideoSize x2 = ba4.x(1000, photo2.video_sizes);
                                            TLRPC.VideoSize R = ba4.R(photo2);
                                            if (R != null) {
                                                user2 = user;
                                                if (user != null && user2.premium) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                arrayList11.add(new i9c(R, z6, 2));
                                                z5 = false;
                                                arrayList9.add(null);
                                                arrayList6.add(null);
                                            } else {
                                                user2 = user;
                                                z5 = false;
                                                arrayList11.add(null);
                                                arrayList9.add(gl5.j(x2, photo2));
                                                arrayList6.add(ba4.r(null, x2));
                                            }
                                        } else {
                                            user2 = user;
                                            z5 = false;
                                            arrayList11.add(this.S0);
                                            arrayList9.add(null);
                                            arrayList6.add(null);
                                        }
                                        arrayList12.add(z5);
                                        arrayList13.add(num);
                                        arrayList3 = arrayList15;
                                        arrayList3.add(z5);
                                        user = user2;
                                    } else {
                                        TLRPC.User user3 = user;
                                        arrayList.add(i16);
                                        if (w instanceof TLRPC.TL_photoStrippedSize) {
                                            photoSize = w2;
                                        } else {
                                            photoSize = w;
                                        }
                                        arrayList5.add(ba4.r(null, photoSize));
                                        arrayList10.add(gl5.i(w, photo2));
                                        if (!photo2.video_sizes.isEmpty()) {
                                            TLRPC.VideoSize x3 = ba4.x(1000, photo2.video_sizes);
                                            TLRPC.VideoSize R2 = ba4.R(photo2);
                                            if (R2 != null) {
                                                if (user3 != null && user3.premium) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                user = user3;
                                                arrayList11.add(new i9c(R2, z4, 2));
                                                z3 = false;
                                                arrayList9.add(null);
                                                arrayList6.add(null);
                                            } else {
                                                user = user3;
                                                z3 = false;
                                                arrayList11.add(null);
                                                arrayList9.add(gl5.j(x3, photo2));
                                                arrayList6.add(ba4.r(null, x3));
                                            }
                                        } else {
                                            user = user3;
                                            z3 = false;
                                            arrayList9.add(null);
                                            arrayList6.add(null);
                                            arrayList11.add(null);
                                        }
                                        arrayList12.add(photo2);
                                        arrayList13.add(Integer.valueOf(w2.size));
                                        arrayList3 = arrayList15;
                                        arrayList3.add(z3);
                                    }
                                }
                            }
                            arrayList3 = arrayList15;
                        } else {
                            i6 = i10;
                            arrayList2 = arrayList7;
                            arrayList3 = arrayList14;
                            gl5Var2 = gl5Var;
                            num = num2;
                            arrayList12.add(null);
                            arrayList.add(null);
                            arrayList10.add(null);
                            arrayList11.add(null);
                            arrayList5.add(null);
                            arrayList9.add(null);
                            arrayList6.add(null);
                            arrayList13.add(num);
                            arrayList3.add(null);
                        }
                        i10 = i6 + 1;
                        arrayList14 = arrayList3;
                        num2 = num;
                        i9 = i4;
                        arrayList7 = arrayList2;
                        gl5Var = gl5Var2;
                    }
                    int size4 = arrayList10.size();
                    if (size4 > 1) {
                        int i17 = 0;
                        while (true) {
                            if (size4 > 2) {
                                i5 = 2;
                            } else {
                                i5 = 1;
                            }
                            if (i17 >= i5) {
                                break;
                            }
                            ba4.G(i4).V((gl5) arrayList10.get(i17 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                            i17++;
                        }
                    }
                    getAdapter().g();
                    boolean z8 = this.I0;
                    if (z) {
                        if (!z8 || this.g1) {
                            L();
                        }
                    } else if (!z8 || this.g1) {
                        L();
                        getAdapter().g();
                        B(0.0f, getRealPosition());
                    }
                    if (this.l1 < 0 && this.k1 < 0) {
                        z2 = false;
                        B(0.0f, 0);
                    } else {
                        z2 = false;
                    }
                    this.g1 = z2;
                    op8 op8Var = this.H0;
                    if (op8Var != null) {
                        op8Var.c();
                    }
                    gl5 gl5Var5 = this.r1;
                    if (gl5Var5 != null) {
                        A(gl5Var5, this.s1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i18 = kk7.X1;
        SparseArray sparseArray = this.e1;
        if (i == i18) {
            String str = (String) objArr[0];
            for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                String str2 = (String) arrayList6.get(i19);
                if (str2 == null) {
                    str2 = (String) arrayList5.get(i19);
                }
                if (str2 != null && TextUtils.equals(str, str2)) {
                    RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i19);
                    if (radialProgress2 != null) {
                        radialProgress2.o(true, 1.0f);
                    }
                    invalidate();
                }
            }
        } else if (i == kk7.W1) {
            String str3 = (String) objArr[0];
            for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                String str4 = (String) arrayList6.get(i20);
                if (str4 == null) {
                    str4 = (String) arrayList5.get(i20);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) sparseArray.get(i20);
                    if (radialProgress22 != null) {
                        radialProgress22.o(true, Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())));
                    }
                    invalidate();
                }
            }
        } else if (i == kk7.b0 && this.d1 == 0 && (w97Var = this.T0) != null) {
            w97Var.f();
            w97 w97Var3 = this.T0;
            int currentItem = getCurrentItem();
            rp8 rp8Var = this.E0;
            if (rp8Var != null) {
                i3 = rp8Var.j();
            } else {
                i3 = 0;
            }
            w97Var3.b(currentItem - i3, true);
        }
    }

    public kp8 getBlurDrawer() {
        return this.q1;
    }

    public float getCurrentItemProgress() {
        km m;
        be0 currentItemView = getCurrentItemView();
        if (currentItemView == null || (m = currentItemView.getImageReceiver().m()) == null) {
            return 0.0f;
        }
        return m.n();
    }

    public be0 getCurrentItemView() {
        rp8 rp8Var = this.E0;
        if (rp8Var != null) {
            ArrayList arrayList = rp8Var.c;
            if (!arrayList.isEmpty()) {
                return ((pp8) arrayList.get(getCurrentItem())).c;
            }
            return null;
        }
        return null;
    }

    public long getDialogId() {
        return this.F0;
    }

    public int getRealCount() {
        int size = this.W0.size();
        if (this.j1) {
            return size + 1;
        }
        return size;
    }

    public int getRealPosition() {
        return this.E0.k(getCurrentItem());
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.D0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        kp8 kp8Var = this.q1;
        if (kp8Var != null) {
            kp8Var.setTranslationY(getHeight() - this.q1.getMeasuredHeight());
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        kp8 kp8Var = this.q1;
        if (kp8Var != null) {
            kp8Var.H = true;
            kp8Var.postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        kp8 kp8Var = this.q1;
        if (kp8Var != null) {
            kp8Var.setAlpha(f);
        }
    }

    public void setAnimatedFileMaybe(km kmVar) {
        rp8 rp8Var;
        if (kmVar != null && (rp8Var = this.E0) != null) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if ((childAt instanceof be0) && rp8Var.k(rp8Var.d.indexOf(childAt)) == 0) {
                    be0 be0Var = (be0) childAt;
                    km m = be0Var.getImageReceiver().m();
                    if (m != kmVar) {
                        if (m != null) {
                            m.w(be0Var);
                        }
                        be0Var.setImageDrawable(kmVar);
                        kmVar.f(this);
                        kmVar.S = true;
                    }
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.G0 = chatFull;
        ArrayList arrayList = this.W0;
        if (!arrayList.isEmpty() && arrayList.get(0) == null && this.G0 != null) {
            ArrayList arrayList2 = this.Y0;
            if (arrayList2.get(0) != null && ba4.U(((gl5) arrayList2.get(0)).f, this.G0.chat_photo)) {
                arrayList.set(0, this.G0.chat_photo);
                boolean isEmpty = this.G0.chat_photo.video_sizes.isEmpty();
                ArrayList arrayList3 = this.U0;
                ArrayList arrayList4 = this.X0;
                if (!isEmpty) {
                    TLRPC.VideoSize x = ba4.x(1000, this.G0.chat_photo.video_sizes);
                    arrayList4.set(0, gl5.j(x, this.G0.chat_photo));
                    arrayList3.set(0, ba4.r(null, x));
                    op8 op8Var = this.H0;
                    if (op8Var != null) {
                        op8Var.c();
                    }
                } else {
                    arrayList4.set(0, null);
                    arrayList3.add(0, null);
                }
                this.c1.set(0, null);
                this.E0.g();
            }
        }
    }

    public void setCreateThumbFromParent(boolean z) {
        this.f1 = z;
    }

    public void setData(long j) {
        M(j, false);
    }

    public void setHasActiveVideo(boolean z) {
        this.j1 = z;
    }

    public void setImagesLayerNum(int i) {
        this.m1 = i;
    }

    public void setInvalidateWithParent(boolean z) {
        this.h1 = z;
    }

    public void setParentAvatarImage(be0 be0Var) {
        rp8 rp8Var = this.E0;
        if (rp8Var != null) {
            rp8Var.g = be0Var;
        }
    }

    public void setPinchToZoomHelper(ma8 ma8Var) {
        this.i1 = ma8Var;
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        kp8 kp8Var = this.q1;
        if (kp8Var != null) {
            kp8Var.setVisibility(i);
        }
    }

    public void setCustomAvatarProgress(float f) {
    }

    public sp8(Activity activity, a aVar, o39 o39Var, qb0 qb0Var) {
        super(activity);
        this.y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i = y6c.t0;
        this.M0 = i;
        this.N0 = new Path();
        this.O0 = new RectF();
        this.P0 = new float[8];
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.c1 = new ArrayList();
        this.e1 = new SparseArray();
        this.f1 = true;
        this.k1 = -1;
        this.l1 = -1;
        setOffscreenPageLimit(2);
        this.q1 = null;
        this.K0 = false;
        this.D0 = o39Var;
        ConnectionsManager.generateClassGuid();
        this.A0 = aVar;
        this.z0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.H0 = qb0Var;
        b(new lp8(this));
        rp8 rp8Var = new rp8(this, getContext(), null);
        this.E0 = rp8Var;
        setAdapter((kh2) rp8Var);
        kk7.f(i).b(this, kk7.a0);
        kk7.f(i).b(this, kk7.X1);
        kk7.f(i).b(this, kk7.W1);
        kk7.f(i).b(this, kk7.b0);
        kk7.f(i).b(this, kk7.f3);
        this.T0 = null;
    }
}
