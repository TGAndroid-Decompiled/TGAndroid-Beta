package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class pr2 implements ir2, vcb, mv8 {
    public static final nr2 n = new nr2((byte) 0);
    public static final byte[] r = {0, 7, 8, 15};
    public static final byte[] s = {0, 119, -120, -1};
    public static final byte[] w = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    public pr2(Executor executor, ArrayList arrayList, ArrayList arrayList2, mr2 mr2Var) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        l54 l54Var = new l54(executor);
        this.e = l54Var;
        this.h = mr2Var;
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        arrayList3.add(xq2.c(l54Var, l54.class, jcb.class, uw8.class));
        arrayList3.add(xq2.c(this, pr2.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            xq2 xq2Var = (xq2) obj;
            if (xq2Var != null) {
                arrayList3.add(xq2Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((nv8) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((mr2) this.h).g(componentRegistrar));
                        it.remove();
                    }
                } catch (zr5 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((xq2) it2.next()).b.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj3 = array[i4];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.d).contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            ((HashSet) this.d).add(obj3.toString());
                        }
                        i4++;
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                ide.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                ide.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList3.get(i5);
                i5++;
                xq2 xq2Var2 = (xq2) obj4;
                ((HashMap) this.a).put(xq2Var2, new e26(new or2(this, xq2Var2, (byte) 0)));
            }
            arrayList5.addAll(v(arrayList3));
            arrayList5.addAll(w());
            u();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f).get();
        if (bool != null) {
            h((HashMap) this.a, bool.booleanValue());
        }
    }

    public static byte[] b(int i, int i2, ye1 ye1Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ye1Var.f(i2);
        }
        return bArr;
    }

    public static int[] j() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            if (i6 < 8) {
                if ((i6 & 1) != 0) {
                    i3 = 255;
                } else {
                    i3 = 0;
                }
                if ((i6 & 2) != 0) {
                    i4 = 255;
                } else {
                    i4 = 0;
                }
                if ((i6 & 4) != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                iArr[i6] = l(255, i3, i4, i5);
            } else {
                int i7 = 127;
                if ((i6 & 1) != 0) {
                    i = 127;
                } else {
                    i = 0;
                }
                if ((i6 & 2) != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if ((i6 & 4) == 0) {
                    i7 = 0;
                }
                iArr[i6] = l(255, i, i2, i7);
            }
        }
        return iArr;
    }

    public static int[] k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i19 = 0; i19 < 256; i19++) {
            int i20 = 255;
            if (i19 < 8) {
                if ((i19 & 1) != 0) {
                    i17 = 255;
                } else {
                    i17 = 0;
                }
                if ((i19 & 2) != 0) {
                    i18 = 255;
                } else {
                    i18 = 0;
                }
                if ((i19 & 4) == 0) {
                    i20 = 0;
                }
                iArr[i19] = l(63, i17, i18, i20);
            } else {
                int i21 = i19 & 136;
                int i22 = 170;
                int i23 = 85;
                if (i21 != 0) {
                    if (i21 != 8) {
                        int i24 = 43;
                        if (i21 != 128) {
                            if (i21 == 136) {
                                if ((i19 & 1) != 0) {
                                    i13 = 43;
                                } else {
                                    i13 = 0;
                                }
                                if ((i19 & 16) != 0) {
                                    i14 = 85;
                                } else {
                                    i14 = 0;
                                }
                                int i25 = i13 + i14;
                                if ((i19 & 2) != 0) {
                                    i15 = 43;
                                } else {
                                    i15 = 0;
                                }
                                if ((i19 & 32) != 0) {
                                    i16 = 85;
                                } else {
                                    i16 = 0;
                                }
                                int i26 = i15 + i16;
                                if ((i19 & 4) == 0) {
                                    i24 = 0;
                                }
                                if ((i19 & 64) == 0) {
                                    i23 = 0;
                                }
                                iArr[i19] = l(255, i25, i26, i24 + i23);
                            }
                        } else {
                            if ((i19 & 1) != 0) {
                                i9 = 43;
                            } else {
                                i9 = 0;
                            }
                            int i27 = i9 + 127;
                            if ((i19 & 16) != 0) {
                                i10 = 85;
                            } else {
                                i10 = 0;
                            }
                            int i28 = i27 + i10;
                            if ((i19 & 2) != 0) {
                                i11 = 43;
                            } else {
                                i11 = 0;
                            }
                            int i29 = i11 + 127;
                            if ((i19 & 32) != 0) {
                                i12 = 85;
                            } else {
                                i12 = 0;
                            }
                            int i30 = i29 + i12;
                            if ((i19 & 4) == 0) {
                                i24 = 0;
                            }
                            int i31 = i24 + 127;
                            if ((i19 & 64) == 0) {
                                i23 = 0;
                            }
                            iArr[i19] = l(255, i28, i30, i31 + i23);
                        }
                    } else {
                        if ((i19 & 1) != 0) {
                            i5 = 85;
                        } else {
                            i5 = 0;
                        }
                        if ((i19 & 16) != 0) {
                            i6 = 170;
                        } else {
                            i6 = 0;
                        }
                        int i32 = i5 + i6;
                        if ((i19 & 2) != 0) {
                            i7 = 85;
                        } else {
                            i7 = 0;
                        }
                        if ((i19 & 32) != 0) {
                            i8 = 170;
                        } else {
                            i8 = 0;
                        }
                        int i33 = i7 + i8;
                        if ((i19 & 4) == 0) {
                            i23 = 0;
                        }
                        if ((i19 & 64) == 0) {
                            i22 = 0;
                        }
                        iArr[i19] = l(127, i32, i33, i23 + i22);
                    }
                } else {
                    if ((i19 & 1) != 0) {
                        i = 85;
                    } else {
                        i = 0;
                    }
                    if ((i19 & 16) != 0) {
                        i2 = 170;
                    } else {
                        i2 = 0;
                    }
                    int i34 = i + i2;
                    if ((i19 & 2) != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if ((i19 & 32) != 0) {
                        i4 = 170;
                    } else {
                        i4 = 0;
                    }
                    int i35 = i3 + i4;
                    if ((i19 & 4) == 0) {
                        i23 = 0;
                    }
                    if ((i19 & 64) == 0) {
                        i22 = 0;
                    }
                    iArr[i19] = l(255, i34, i35, i23 + i22);
                }
            }
        }
        return iArr;
    }

    public static int l(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static void o(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        boolean z;
        byte b;
        int i4;
        int f;
        int f2;
        int i5;
        byte[] bArr3;
        boolean z2;
        int i6;
        int f3;
        int i7;
        int i8;
        int i9;
        int i10;
        byte[] bArr4;
        boolean z3;
        int f4;
        int i11;
        Paint paint2 = paint;
        ye1 ye1Var = new ye1(bArr.length, bArr);
        int i12 = i2;
        int i13 = i3;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (ye1Var.b() != 0) {
            int i14 = 8;
            int f5 = ye1Var.f(8);
            if (f5 != 240) {
                int i15 = 3;
                int i16 = 2;
                int i17 = 4;
                switch (f5) {
                    case 16:
                        if (i == 3) {
                            if (bArr5 == null) {
                                bArr2 = s;
                            } else {
                                bArr2 = bArr5;
                            }
                        } else if (i == 2) {
                            if (bArr7 == null) {
                                bArr2 = r;
                            } else {
                                bArr2 = bArr7;
                            }
                        } else {
                            bArr2 = null;
                        }
                        boolean z4 = false;
                        while (true) {
                            int f6 = ye1Var.f(2);
                            if (f6 != 0) {
                                z = z4;
                                b = f6;
                                i4 = 1;
                            } else {
                                if (ye1Var.e()) {
                                    f = ye1Var.f(3) + 3;
                                    z = z4;
                                    f2 = ye1Var.f(2);
                                } else {
                                    if (ye1Var.e()) {
                                        z = z4;
                                        i4 = 1;
                                    } else {
                                        int f7 = ye1Var.f(2);
                                        if (f7 != 0) {
                                            if (f7 != 1) {
                                                if (f7 != 2) {
                                                    if (f7 != 3) {
                                                        z = z4;
                                                    } else {
                                                        f = ye1Var.f(8) + 29;
                                                        f2 = ye1Var.f(2);
                                                        z = z4;
                                                    }
                                                } else {
                                                    i4 = ye1Var.f(4) + 12;
                                                    b = ye1Var.f(2);
                                                    z = z4;
                                                }
                                            } else {
                                                z = z4;
                                                i4 = 2;
                                            }
                                        } else {
                                            z = true;
                                        }
                                        b = 0;
                                        i4 = 0;
                                    }
                                    b = 0;
                                }
                                i4 = f;
                                b = f2;
                            }
                            if (i4 != 0 && paint2 != null) {
                                if (bArr2 != null) {
                                    b = bArr2[b];
                                }
                                paint2.setColor(iArr[b]);
                                i5 = i12;
                                canvas.drawRect(i12, i13, i12 + i4, i13 + 1, paint2);
                            } else {
                                i5 = i12;
                            }
                            i12 = i5 + i4;
                            if (z) {
                                ye1Var.c();
                                continue;
                            } else {
                                paint2 = paint;
                                z4 = z;
                            }
                        }
                    case 17:
                        if (i == 3) {
                            if (bArr6 == null) {
                                bArr4 = w;
                            } else {
                                bArr4 = bArr6;
                            }
                            bArr3 = bArr4;
                        } else {
                            bArr3 = null;
                        }
                        boolean z5 = false;
                        while (true) {
                            int f8 = ye1Var.f(i17);
                            if (f8 != 0) {
                                z2 = z5;
                                i7 = f8;
                                i6 = 1;
                            } else if (!ye1Var.e()) {
                                int f9 = ye1Var.f(i15);
                                if (f9 != 0) {
                                    i6 = f9 + 2;
                                    z2 = z5;
                                    i7 = 0;
                                } else {
                                    z2 = true;
                                    i6 = 0;
                                    i7 = 0;
                                }
                            } else {
                                if (!ye1Var.e()) {
                                    i6 = ye1Var.f(i16) + 4;
                                    i7 = ye1Var.f(i17);
                                } else {
                                    int f10 = ye1Var.f(i16);
                                    if (f10 != 0) {
                                        if (f10 != 1) {
                                            if (f10 != i16) {
                                                if (f10 != i15) {
                                                    z2 = z5;
                                                    i6 = 0;
                                                } else {
                                                    i6 = ye1Var.f(i14) + 25;
                                                    f3 = ye1Var.f(i17);
                                                }
                                            } else {
                                                i6 = ye1Var.f(i17) + 9;
                                                f3 = ye1Var.f(i17);
                                            }
                                            i7 = f3;
                                        } else {
                                            z2 = z5;
                                            i6 = i16;
                                        }
                                    } else {
                                        z2 = z5;
                                        i6 = 1;
                                    }
                                    i7 = 0;
                                }
                                z2 = z5;
                            }
                            if (i6 != 0 && paint2 != null) {
                                if (bArr3 != null) {
                                    i7 = bArr3[i7];
                                }
                                paint2.setColor(iArr[i7]);
                                i9 = i15;
                                i10 = 2;
                                i8 = i12;
                                canvas.drawRect(i12, i13, i12 + i6, i13 + 1, paint2);
                            } else {
                                i8 = i12;
                                i9 = i15;
                                i10 = i16;
                            }
                            i12 = i8 + i6;
                            if (z2) {
                                ye1Var.c();
                                continue;
                            } else {
                                z5 = z2;
                                i15 = i9;
                                i16 = i10;
                                i17 = 4;
                                i14 = 8;
                            }
                        }
                    case 18:
                        boolean z6 = false;
                        while (true) {
                            int f11 = ye1Var.f(8);
                            if (f11 != 0) {
                                z3 = z6;
                                f4 = 1;
                            } else if (!ye1Var.e()) {
                                int f12 = ye1Var.f(7);
                                if (f12 != 0) {
                                    z3 = z6;
                                    f4 = f12;
                                    f11 = 0;
                                } else {
                                    z3 = true;
                                    f11 = 0;
                                    f4 = 0;
                                }
                            } else {
                                z3 = z6;
                                f4 = ye1Var.f(7);
                                f11 = ye1Var.f(8);
                            }
                            if (f4 != 0 && paint2 != null) {
                                paint2.setColor(iArr[f11]);
                                i11 = i12;
                                canvas.drawRect(i12, i13, i12 + f4, i13 + 1, paint2);
                            } else {
                                i11 = i12;
                            }
                            i12 = i11 + f4;
                            if (z3) {
                                continue;
                            } else {
                                z6 = z3;
                            }
                        }
                    default:
                        switch (f5) {
                            case 32:
                                bArr7 = b(4, 4, ye1Var);
                                continue;
                            case 33:
                                bArr5 = b(4, 8, ye1Var);
                                continue;
                            case 34:
                                bArr6 = b(16, 8, ye1Var);
                                continue;
                                continue;
                        }
                }
            } else {
                i13 += 2;
                i12 = i2;
            }
            paint2 = paint;
        }
    }

    public static ys3 q(ye1 ye1Var, int i) {
        int[] iArr;
        int f;
        int i2;
        int f2;
        int f3;
        int i3;
        int i4 = 8;
        int f4 = ye1Var.f(8);
        ye1Var.n(8);
        int i5 = 2;
        int i6 = i - 2;
        int i7 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] j = j();
        int[] k = k();
        while (i6 > 0) {
            int f5 = ye1Var.f(i4);
            int f6 = ye1Var.f(i4);
            if ((f6 & 128) != 0) {
                iArr = iArr2;
            } else if ((f6 & 64) != 0) {
                iArr = j;
            } else {
                iArr = k;
            }
            if ((f6 & 1) != 0) {
                f3 = ye1Var.f(i4);
                i3 = ye1Var.f(i4);
                f = ye1Var.f(i4);
                f2 = ye1Var.f(i4);
                i2 = i6 - 6;
            } else {
                int f7 = ye1Var.f(4) << 4;
                f = ye1Var.f(4) << 4;
                i2 = i6 - 4;
                f2 = ye1Var.f(i5) << 6;
                f3 = ye1Var.f(6) << i5;
                i3 = f7;
            }
            if (f3 == 0) {
                i3 = i7;
                f = i3;
                f2 = 255;
            }
            double d = f3;
            double d2 = i3 - 128;
            double d3 = f - 128;
            iArr[f5] = l((byte) (255 - (f2 & 255)), hac.i((int) ((1.402d * d2) + d), 0, 255), hac.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), hac.i((int) ((d3 * 1.772d) + d), 0, 255));
            i6 = i2;
            i7 = 0;
            f4 = f4;
            k = k;
            i4 = 8;
            i5 = 2;
        }
        return new ys3(f4, iArr2, j, k);
    }

    public static at3 s(ye1 ye1Var) {
        byte[] bArr;
        int f = ye1Var.f(16);
        ye1Var.n(4);
        int f2 = ye1Var.f(2);
        boolean e = ye1Var.e();
        ye1Var.n(1);
        byte[] bArr2 = hac.b;
        if (f2 == 1) {
            ye1Var.n(ye1Var.f(8) << 4);
        } else if (f2 == 0) {
            int f3 = ye1Var.f(16);
            int f4 = ye1Var.f(16);
            if (f3 > 0) {
                bArr2 = new byte[f3];
                ye1Var.i(f3, bArr2);
            }
            if (f4 > 0) {
                bArr = new byte[f4];
                ye1Var.i(f4, bArr);
                return new at3(f, e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new at3(f, e, bArr2, bArr);
    }

    public static void y(FrameLayout frameLayout) {
        d05 d05Var = d05.e;
        Context context = frameLayout.getContext();
        int c = d05Var.c(context, e05.a);
        String b = r4d.b(context, c);
        String c2 = r4d.c(context, c);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        Intent a = d05Var.a(c, context, null);
        if (a != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c2);
            linearLayout.addView(button);
            button.setOnClickListener(new sd3(context, a));
        }
    }

    public final void A(f4d f4dVar) {
        if (((wm9) this.a) != null) {
            f4dVar.b();
            return;
        }
        LinkedList linkedList = (LinkedList) this.b;
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.b = linkedList;
        }
        linkedList.add(f4dVar);
        cf9 cf9Var = (cf9) this.c;
        this.f = cf9Var;
        ArrayList arrayList = (ArrayList) this.h;
        Context context = (Context) this.e;
        if (cf9Var != null && ((wm9) this.a) == null) {
            try {
                synchronized (rk6.class) {
                    rk6.a(context);
                }
                mye a0 = w2f.a(context).a0(new eq7(context));
                if (a0 != null) {
                    ((cf9) this.f).z(new wm9((su) this.d, a0));
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((wm9) this.a).s((u05) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e) {
                i2d.h(e);
            } catch (w05 unused) {
            }
        }
    }

    @Override
    public final Object a(Class cls) {
        return i(yy8.a(cls));
    }

    @Override
    public final Set c(yy8 yy8Var) {
        nv8 nv8Var;
        synchronized (this) {
            nv8Var = (g26) ((HashMap) this.c).get(yy8Var);
            if (nv8Var == null) {
                nv8Var = n;
            }
        }
        return (Set) nv8Var.get();
    }

    @Override
    public final nv8 d(Class cls) {
        return f(yy8.a(cls));
    }

    @Override
    public final xs7 e(yy8 yy8Var) {
        nv8 f = f(yy8Var);
        if (f == null) {
            return new xs7(xs7.c, xs7.d);
        }
        if (f instanceof xs7) {
            return (xs7) f;
        }
        return new xs7(null, f);
    }

    @Override
    public final synchronized nv8 f(yy8 yy8Var) {
        kte.a(yy8Var, "Null interface requested.");
        return (nv8) ((HashMap) this.b).get(yy8Var);
    }

    @Override
    public final lcb g(int i, int i2, byte[] bArr) {
        return hg9.c(this, bArr, i2);
    }

    @Override
    public final Object mo8get() {
        kg7 kg7Var = new kg7((byte) 29);
        k4f k4fVar = new k4f((byte) 28);
        ?? obj = new Object();
        obj.a = (Context) ((mq5) this.a).a;
        obj.b = (of7) ((mv8) this.b).mo8get();
        obj.c = (mq9) ((mv8) this.c).mo8get();
        obj.d = (in3) ((wm9) this.d).mo8get();
        obj.e = (Executor) ((mv8) this.e).mo8get();
        obj.f = (mq9) ((mv8) this.f).mo8get();
        obj.g = kg7Var;
        obj.h = k4fVar;
        obj.i = (mq9) ((mv8) this.h).mo8get();
        return obj;
    }

    public final void h(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            nv8 nv8Var = (nv8) entry.getValue();
            byte b = ((xq2) entry.getKey()).d;
            if (b == 1 || (b == 2 && z)) {
                nv8Var.get();
            }
        }
        l54 l54Var = (l54) this.e;
        synchronized (l54Var) {
            arrayDeque = l54Var.b;
            if (arrayDeque != null) {
                l54Var.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw kt6.l(it);
            }
        }
    }

    @Override
    public final Object i(yy8 yy8Var) {
        nv8 f = f(yy8Var);
        if (f == null) {
            return null;
        }
        return f.get();
    }

    public final void m() {
        x(null);
        bu5 bu5Var = (bu5) this.c;
        if (bu5Var != null) {
            bu5Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void n(boolean z) {
        HashMap hashMap;
        AtomicReference atomicReference = (AtomicReference) this.f;
        Boolean valueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap((HashMap) this.a);
        }
        h(hashMap, z);
    }

    @Override
    public final void p(byte[] bArr, int i, int i2, ucb ucbVar, fu2 fu2Var) {
        i53 i53Var;
        SparseArray sparseArray;
        int i3;
        int i4;
        ArrayList arrayList;
        Paint paint;
        int i5;
        int i6;
        SparseArray sparseArray2;
        int i7;
        ct3 ct3Var;
        int i8;
        int i9;
        int[] iArr;
        Paint paint2;
        int i10;
        int[] iArr2;
        SparseArray sparseArray3;
        int i11;
        Paint paint3;
        int i12;
        ct3 ct3Var2;
        int i13;
        int i14;
        int i15;
        int i16;
        pr2 pr2Var = this;
        ye1 ye1Var = new ye1(i + i2, bArr);
        ye1Var.l(i);
        Paint paint4 = (Paint) pr2Var.b;
        Canvas canvas = (Canvas) pr2Var.c;
        et3 et3Var = (et3) pr2Var.f;
        SparseArray sparseArray4 = et3Var.f;
        SparseArray sparseArray5 = et3Var.g;
        int i17 = et3Var.b;
        SparseArray sparseArray6 = et3Var.c;
        SparseArray sparseArray7 = et3Var.d;
        SparseArray sparseArray8 = et3Var.e;
        int i18 = et3Var.a;
        while (ye1Var.b() >= 48 && ye1Var.f(8) == 15) {
            int f = ye1Var.f(8);
            int f2 = ye1Var.f(16);
            int f3 = ye1Var.f(16);
            int d = ye1Var.d() + f3;
            if ((f3 << 3) > ye1Var.b()) {
                ncd.f("DvbParser", "Data field length exceeds limit");
                ye1Var.n(ye1Var.b());
                sparseArray3 = sparseArray5;
                i11 = i17;
                paint3 = paint4;
                i12 = i18;
            } else {
                switch (f) {
                    case 16:
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        if (f2 == i18) {
                            rk0 rk0Var = et3Var.i;
                            int i19 = 8;
                            ye1Var.f(8);
                            int f4 = ye1Var.f(4);
                            int f5 = ye1Var.f(2);
                            ye1Var.n(2);
                            int i20 = f3 - 2;
                            SparseArray sparseArray9 = new SparseArray();
                            while (i20 > 0) {
                                int f6 = ye1Var.f(i19);
                                ye1Var.n(i19);
                                sparseArray9.put(f6, new bt3(ye1Var.f(16), ye1Var.f(16)));
                                i18 = i18;
                                i20 -= 6;
                                i19 = 8;
                            }
                            i12 = i18;
                            rk0 rk0Var2 = new rk0(f4, f5, sparseArray9);
                            if (f5 != 0) {
                                et3Var.i = rk0Var2;
                                sparseArray6.clear();
                                sparseArray7.clear();
                                sparseArray8.clear();
                                break;
                            } else if (rk0Var != null && rk0Var.b != f4) {
                                et3Var.i = rk0Var2;
                                break;
                            }
                        }
                        i12 = i18;
                        break;
                    case 17:
                        rk0 rk0Var3 = et3Var.i;
                        if (f2 == i18 && rk0Var3 != null) {
                            int f7 = ye1Var.f(8);
                            ye1Var.n(4);
                            boolean e = ye1Var.e();
                            ye1Var.n(3);
                            int f8 = ye1Var.f(16);
                            int f9 = ye1Var.f(16);
                            ye1Var.f(3);
                            int f10 = ye1Var.f(3);
                            int i21 = 2;
                            ye1Var.n(2);
                            int f11 = ye1Var.f(8);
                            int f12 = ye1Var.f(8);
                            int f13 = ye1Var.f(4);
                            int f14 = ye1Var.f(2);
                            ye1Var.n(2);
                            int i22 = f3 - 10;
                            SparseArray sparseArray10 = new SparseArray();
                            while (i22 > 0) {
                                int i23 = i17;
                                int i24 = i22;
                                int f15 = ye1Var.f(16);
                                int f16 = ye1Var.f(i21);
                                ye1Var.f(i21);
                                Paint paint5 = paint4;
                                int f17 = ye1Var.f(12);
                                SparseArray sparseArray11 = sparseArray5;
                                ye1Var.n(4);
                                int f18 = ye1Var.f(12);
                                int i25 = i24 - 6;
                                if (f16 == 1 || f16 == 2) {
                                    ye1Var.f(8);
                                    ye1Var.f(8);
                                    i25 = i24 - 8;
                                }
                                sparseArray10.put(f15, new dt3(f17, f18));
                                i22 = i25;
                                i17 = i23;
                                paint4 = paint5;
                                sparseArray5 = sparseArray11;
                                i21 = 2;
                            }
                            sparseArray3 = sparseArray5;
                            i11 = i17;
                            paint3 = paint4;
                            ct3 ct3Var3 = new ct3(f7, e, f8, f9, f10, f11, f12, f13, f14, sparseArray10);
                            if (rk0Var3.c == 0 && (ct3Var2 = (ct3) sparseArray6.get(f7)) != null) {
                                SparseArray sparseArray12 = ct3Var2.j;
                                for (int i26 = 0; i26 < sparseArray12.size(); i26++) {
                                    ct3Var3.j.put(sparseArray12.keyAt(i26), (dt3) sparseArray12.valueAt(i26));
                                }
                            }
                            sparseArray6.put(ct3Var3.a, ct3Var3);
                            i12 = i18;
                            break;
                        }
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                    case 18:
                        if (f2 == i18) {
                            ys3 q = q(ye1Var, f3);
                            sparseArray7.put(q.a, q);
                        } else if (f2 == i17) {
                            ys3 q2 = q(ye1Var, f3);
                            sparseArray4.put(q2.a, q2);
                        }
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                    case 19:
                        if (f2 == i18) {
                            at3 s2 = s(ye1Var);
                            sparseArray8.put(s2.a, s2);
                        } else if (f2 == i17) {
                            at3 s3 = s(ye1Var);
                            sparseArray5.put(s3.a, s3);
                        }
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                    case 20:
                        if (f2 == i18) {
                            ye1Var.n(4);
                            boolean e2 = ye1Var.e();
                            ye1Var.n(3);
                            int f19 = ye1Var.f(16);
                            int f20 = ye1Var.f(16);
                            if (e2) {
                                int f21 = ye1Var.f(16);
                                int f22 = ye1Var.f(16);
                                int f23 = ye1Var.f(16);
                                i13 = f22;
                                i14 = ye1Var.f(16);
                                i16 = f23;
                                i15 = f21;
                            } else {
                                i13 = f19;
                                i14 = f20;
                                i15 = 0;
                                i16 = 0;
                            }
                            et3Var.h = new zs3(f19, f20, i15, i13, i16, i14);
                        }
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                    default:
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                }
                ye1Var.o(d - ye1Var.d());
            }
            i18 = i12;
            i17 = i11;
            paint4 = paint3;
            sparseArray5 = sparseArray3;
        }
        SparseArray sparseArray13 = sparseArray5;
        Paint paint6 = paint4;
        rk0 rk0Var4 = et3Var.i;
        if (rk0Var4 == null) {
            ko5 ko5Var = mo5.b;
            i53Var = new i53(-9223372036854775807L, -9223372036854775807L, y79.e);
        } else {
            zs3 zs3Var = et3Var.h;
            if (zs3Var == null) {
                zs3Var = (zs3) pr2Var.d;
            }
            int i27 = zs3Var.b;
            int i28 = zs3Var.a;
            Bitmap bitmap = (Bitmap) pr2Var.h;
            if (bitmap == null || i28 + 1 != bitmap.getWidth() || i27 + 1 != ((Bitmap) pr2Var.h).getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(i28 + 1, i27 + 1, Bitmap.Config.ARGB_8888);
                pr2Var.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray14 = (SparseArray) rk0Var4.d;
            int i29 = 0;
            while (i29 < sparseArray14.size()) {
                canvas.save();
                bt3 bt3Var = (bt3) sparseArray14.valueAt(i29);
                ct3 ct3Var4 = (ct3) sparseArray6.get(sparseArray14.keyAt(i29));
                int i30 = bt3Var.a + zs3Var.c;
                int i31 = bt3Var.b + zs3Var.e;
                int i32 = ct3Var4.c;
                int i33 = ct3Var4.f;
                SparseArray sparseArray15 = sparseArray14;
                int i34 = ct3Var4.d;
                int i35 = i27;
                int i36 = i30 + i32;
                int i37 = i28;
                SparseArray sparseArray16 = sparseArray6;
                int i38 = i31 + i34;
                int i39 = i29;
                canvas.clipRect(i30, i31, Math.min(i36, zs3Var.d), Math.min(i38, zs3Var.f));
                ys3 ys3Var = (ys3) sparseArray7.get(i33);
                if (ys3Var == null && (ys3Var = (ys3) sparseArray4.get(i33)) == null) {
                    ys3Var = (ys3) pr2Var.e;
                }
                int[] iArr3 = ys3Var.b;
                int[] iArr4 = ys3Var.c;
                int[] iArr5 = ys3Var.d;
                zs3 zs3Var2 = zs3Var;
                SparseArray sparseArray17 = ct3Var4.j;
                SparseArray sparseArray18 = sparseArray4;
                int i40 = 0;
                while (i40 < sparseArray17.size()) {
                    int keyAt = sparseArray17.keyAt(i40);
                    SparseArray sparseArray19 = sparseArray17;
                    dt3 dt3Var = (dt3) sparseArray17.valueAt(i40);
                    at3 at3Var = (at3) sparseArray8.get(keyAt);
                    int i41 = i40;
                    SparseArray sparseArray20 = sparseArray13;
                    if (at3Var == null) {
                        at3Var = (at3) sparseArray20.get(keyAt);
                    }
                    at3 at3Var2 = at3Var;
                    if (at3Var2 != null) {
                        sparseArray13 = sparseArray20;
                        if (at3Var2.b) {
                            paint2 = null;
                        } else {
                            paint2 = (Paint) pr2Var.a;
                        }
                        Paint paint7 = paint2;
                        ct3 ct3Var5 = ct3Var4;
                        int i42 = ct3Var5.e;
                        int i43 = dt3Var.a + i30;
                        int i44 = dt3Var.b + i31;
                        if (i42 == 3) {
                            sparseArray2 = sparseArray8;
                            i10 = i31;
                            iArr2 = iArr5;
                        } else {
                            sparseArray2 = sparseArray8;
                            i10 = i31;
                            if (i42 == 2) {
                                iArr2 = iArr4;
                            } else {
                                iArr2 = iArr3;
                            }
                        }
                        i8 = i30;
                        i9 = i32;
                        ct3Var = ct3Var5;
                        iArr = iArr4;
                        i6 = i34;
                        i7 = i10;
                        o(at3Var2.c, iArr2, i42, i43, i44, paint7, canvas);
                        o(at3Var2.d, iArr2, i42, i43, i44 + 1, paint7, canvas);
                    } else {
                        i6 = i34;
                        sparseArray13 = sparseArray20;
                        sparseArray2 = sparseArray8;
                        i7 = i31;
                        ct3Var = ct3Var4;
                        i8 = i30;
                        i9 = i32;
                        iArr = iArr4;
                    }
                    pr2Var = this;
                    i30 = i8;
                    i31 = i7;
                    ct3Var4 = ct3Var;
                    i40 = i41 + 1;
                    i34 = i6;
                    sparseArray17 = sparseArray19;
                    iArr4 = iArr;
                    sparseArray8 = sparseArray2;
                    i32 = i9;
                }
                int i45 = i34;
                SparseArray sparseArray21 = sparseArray8;
                int i46 = i31;
                ct3 ct3Var6 = ct3Var4;
                int i47 = i30;
                int i48 = i32;
                int[] iArr6 = iArr4;
                if (ct3Var6.b) {
                    int i49 = ct3Var6.e;
                    if (i49 == 3) {
                        i5 = iArr5[ct3Var6.g];
                    } else if (i49 == 2) {
                        i5 = iArr6[ct3Var6.h];
                    } else {
                        i5 = iArr3[ct3Var6.i];
                    }
                    paint = paint6;
                    paint.setColor(i5);
                    sparseArray = sparseArray7;
                    i3 = i35;
                    i4 = i37;
                    arrayList = arrayList2;
                    canvas.drawRect(i47, i46, i36, i38, paint);
                } else {
                    sparseArray = sparseArray7;
                    i3 = i35;
                    i4 = i37;
                    arrayList = arrayList2;
                    paint = paint6;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.h, i47, i46, i48, i45);
                float f24 = i4;
                float f25 = i47 / f24;
                float f26 = i46;
                float f27 = i3;
                arrayList.add(new f53(null, null, null, createBitmap2, f26 / f27, 0, 0, f25, 0, Integer.MIN_VALUE, -3.4028235E38f, i48 / f24, i45 / f27, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                pr2Var = this;
                paint6 = paint;
                sparseArray7 = sparseArray;
                i27 = i3;
                i28 = i4;
                arrayList2 = arrayList;
                sparseArray14 = sparseArray15;
                sparseArray6 = sparseArray16;
                sparseArray4 = sparseArray18;
                sparseArray8 = sparseArray21;
                i29 = i39 + 1;
                zs3Var = zs3Var2;
            }
            i53Var = new i53(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        fu2Var.accept(i53Var);
    }

    @Override
    public final int r() {
        return 2;
    }

    @Override
    public final void reset() {
        et3 et3Var = (et3) this.f;
        et3Var.c.clear();
        et3Var.d.clear();
        et3Var.e.clear();
        et3Var.f.clear();
        et3Var.g.clear();
        et3Var.h = null;
        et3Var.i = null;
    }

    public final void t(xk9 xk9Var, ArrayList arrayList) {
        ylb ylbVar = (ylb) this.b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ud9 ud9Var = (ud9) obj;
                rz8 rz8Var = new rz8(xk9Var.getContext(), ud9Var, ylbVar);
                rz8Var.setPadding(gm.L(8.0f), 0, gm.L(12.0f), 0);
                rz8Var.setBackground(cmb.Y(cmb.v0(cmb.h6, ylbVar), 0, 0));
                rz8Var.setOnClickListener(new jw4(this, xk9Var, ud9Var, (byte) 17));
                ((LinearLayout) this.d).addView(rz8Var, qoe.o(-1, 48));
            }
        }
    }

    public final void u() {
        boolean z;
        HashMap hashMap = (HashMap) this.b;
        HashMap hashMap2 = (HashMap) this.c;
        for (xq2 xq2Var : ((HashMap) this.a).keySet()) {
            for (if3 if3Var : xq2Var.c) {
                if (if3Var.b == 2) {
                    z = true;
                } else {
                    z = false;
                }
                yy8 yy8Var = if3Var.a;
                if (z && !hashMap2.containsKey(yy8Var)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.b = null;
                    obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.a.addAll(set);
                    hashMap2.put(yy8Var, obj);
                } else if (hashMap.containsKey(yy8Var)) {
                    continue;
                } else {
                    byte b = if3Var.b;
                    if (b != 1) {
                        if (b != 2) {
                            hashMap.put(yy8Var, new xs7(xs7.c, xs7.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + xq2Var + ": " + yy8Var);
                    }
                }
            }
        }
    }

    public final ArrayList v(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xq2 xq2Var = (xq2) obj;
            if (!xq2Var.e) {
                nv8 nv8Var = (nv8) ((HashMap) this.a).get(xq2Var);
                for (yy8 yy8Var : xq2Var.b) {
                    if (!hashMap.containsKey(yy8Var)) {
                        hashMap.put(yy8Var, nv8Var);
                    } else {
                        arrayList2.add(new ra2((xs7) ((nv8) hashMap.get(yy8Var)), nv8Var, (byte) 25));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList w() {
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            xq2 xq2Var = (xq2) entry.getKey();
            if (xq2Var.e) {
                nv8 nv8Var = (nv8) entry.getValue();
                for (yy8 yy8Var : xq2Var.b) {
                    if (!hashMap2.containsKey(yy8Var)) {
                        hashMap2.put(yy8Var, new HashSet());
                    }
                    ((Set) hashMap2.get(yy8Var)).add(nv8Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                ?? obj = new Object();
                obj.b = null;
                obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((yy8) entry2.getKey(), obj);
            } else {
                g26 g26Var = (g26) hashMap.get(entry2.getKey());
                for (nv8 nv8Var2 : (Set) entry2.getValue()) {
                    arrayList.add(new ra2(g26Var, nv8Var2, (byte) 26));
                }
            }
        }
        return arrayList;
    }

    public final void x(xk9 xk9Var) {
        xk9 xk9Var2 = (xk9) this.h;
        if (xk9Var2 != xk9Var) {
            if (xk9Var2 != null) {
                xk9Var2.setShowCommandBackground(false);
            }
            this.h = xk9Var;
            if (xk9Var != null) {
                xk9Var.setShowCommandBackground(true);
            }
        }
    }

    public final void z(xk9 xk9Var, String str) {
        bu5 bu5Var;
        bu5 bu5Var2;
        if (str == null) {
            m();
            return;
        }
        ArrayList a = ud9.a(str);
        if (a.isEmpty()) {
            m();
            return;
        }
        x(xk9Var);
        if (((xk9) this.f) == xk9Var && a.equals((ArrayList) this.e) && (bu5Var2 = (bu5) this.c) != null && bu5Var2.E()) {
            return;
        }
        if (((xk9) this.f) == xk9Var && (bu5Var = (bu5) this.c) != null && bu5Var.E() && ((LinearLayout) this.d) != null) {
            this.e = a;
            t(xk9Var, a);
            ((bu5) this.c).P();
            return;
        }
        m();
        x(xk9Var);
        this.f = xk9Var;
        this.e = a;
        LinearLayout linearLayout = new LinearLayout(xk9Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        t(xk9Var, a);
        bu5 d = ((vd9) this.a).d(xk9Var.getEditText());
        d.T = true;
        d.s = (short) 0;
        d.t = false;
        d.q((LinearLayout) this.d, qoe.o(220, -2));
        d.a0 = gm.L(240.0f);
        d.i = (byte) 3;
        d.b0(-gm.L(12.0f), 0.0f);
        d.p = new pp8(this, (byte) 28);
        d.g0 = true;
        if (d.E()) {
            d.D();
        }
        d.a0();
        this.c = d;
    }

    public pr2(vd9 vd9Var, ylb ylbVar) {
        this.a = vd9Var;
        this.b = ylbVar;
    }
}
