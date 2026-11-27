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
public final class xq2 implements qq2, reb, uw8 {
    public static final vq2 n = new vq2((byte) 0);
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

    public xq2(Executor executor, ArrayList arrayList, ArrayList arrayList2, uq2 uq2Var) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        w44 w44Var = new w44(executor);
        this.e = w44Var;
        this.h = uq2Var;
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        arrayList3.add(fq2.c(w44Var, w44.class, feb.class, cy8.class));
        arrayList3.add(fq2.c(this, xq2.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            fq2 fq2Var = (fq2) obj;
            if (fq2Var != null) {
                arrayList3.add(fq2Var);
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((vw8) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((uq2) this.h).f(componentRegistrar));
                        it.remove();
                    }
                } catch (cs5 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((fq2) it2.next()).b.toArray();
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
                xfe.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                xfe.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList3.get(i5);
                i5++;
                fq2 fq2Var2 = (fq2) obj4;
                ((HashMap) this.a).put(fq2Var2, new i26(new wq2(this, fq2Var2, (byte) 0)));
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
            e((HashMap) this.a, bool.booleanValue());
        }
    }

    public static byte[] b(int i, int i2, zd1 zd1Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zd1Var.f(i2);
        }
        return bArr;
    }

    public static int[] i() {
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
                iArr[i6] = m(255, i3, i4, i5);
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
                iArr[i6] = m(255, i, i2, i7);
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
                iArr[i19] = m(63, i17, i18, i20);
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
                                iArr[i19] = m(255, i25, i26, i24 + i23);
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
                            iArr[i19] = m(255, i28, i30, i31 + i23);
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
                        iArr[i19] = m(127, i32, i33, i23 + i22);
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
                    iArr[i19] = m(255, i34, i35, i23 + i22);
                }
            }
        }
        return iArr;
    }

    public static int m(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static void p(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
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
        zd1 zd1Var = new zd1(bArr.length, bArr);
        int i12 = i2;
        int i13 = i3;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (zd1Var.b() != 0) {
            int i14 = 8;
            int f5 = zd1Var.f(8);
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
                            int f6 = zd1Var.f(2);
                            if (f6 != 0) {
                                z = z4;
                                b = f6;
                                i4 = 1;
                            } else {
                                if (zd1Var.e()) {
                                    f = zd1Var.f(3) + 3;
                                    z = z4;
                                    f2 = zd1Var.f(2);
                                } else {
                                    if (zd1Var.e()) {
                                        z = z4;
                                        i4 = 1;
                                    } else {
                                        int f7 = zd1Var.f(2);
                                        if (f7 != 0) {
                                            if (f7 != 1) {
                                                if (f7 != 2) {
                                                    if (f7 != 3) {
                                                        z = z4;
                                                    } else {
                                                        f = zd1Var.f(8) + 29;
                                                        f2 = zd1Var.f(2);
                                                        z = z4;
                                                    }
                                                } else {
                                                    i4 = zd1Var.f(4) + 12;
                                                    b = zd1Var.f(2);
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
                                zd1Var.c();
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
                            int f8 = zd1Var.f(i17);
                            if (f8 != 0) {
                                z2 = z5;
                                i7 = f8;
                                i6 = 1;
                            } else if (!zd1Var.e()) {
                                int f9 = zd1Var.f(i15);
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
                                if (!zd1Var.e()) {
                                    i6 = zd1Var.f(i16) + 4;
                                    i7 = zd1Var.f(i17);
                                } else {
                                    int f10 = zd1Var.f(i16);
                                    if (f10 != 0) {
                                        if (f10 != 1) {
                                            if (f10 != i16) {
                                                if (f10 != i15) {
                                                    z2 = z5;
                                                    i6 = 0;
                                                } else {
                                                    i6 = zd1Var.f(i14) + 25;
                                                    f3 = zd1Var.f(i17);
                                                }
                                            } else {
                                                i6 = zd1Var.f(i17) + 9;
                                                f3 = zd1Var.f(i17);
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
                                zd1Var.c();
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
                            int f11 = zd1Var.f(8);
                            if (f11 != 0) {
                                z3 = z6;
                                f4 = 1;
                            } else if (!zd1Var.e()) {
                                int f12 = zd1Var.f(7);
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
                                f4 = zd1Var.f(7);
                                f11 = zd1Var.f(8);
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
                                bArr7 = b(4, 4, zd1Var);
                                continue;
                            case 33:
                                bArr5 = b(4, 8, zd1Var);
                                continue;
                            case 34:
                                bArr6 = b(16, 8, zd1Var);
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

    public static gs3 q(zd1 zd1Var, int i) {
        int[] iArr;
        int f;
        int i2;
        int f2;
        int f3;
        int i3;
        int i4 = 8;
        int f4 = zd1Var.f(8);
        zd1Var.n(8);
        int i5 = 2;
        int i6 = i - 2;
        int i7 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] i8 = i();
        int[] k = k();
        while (i6 > 0) {
            int f5 = zd1Var.f(i4);
            int f6 = zd1Var.f(i4);
            if ((f6 & 128) != 0) {
                iArr = iArr2;
            } else if ((f6 & 64) != 0) {
                iArr = i8;
            } else {
                iArr = k;
            }
            if ((f6 & 1) != 0) {
                f3 = zd1Var.f(i4);
                i3 = zd1Var.f(i4);
                f = zd1Var.f(i4);
                f2 = zd1Var.f(i4);
                i2 = i6 - 6;
            } else {
                int f7 = zd1Var.f(4) << 4;
                f = zd1Var.f(4) << 4;
                i2 = i6 - 4;
                f2 = zd1Var.f(i5) << 6;
                f3 = zd1Var.f(6) << i5;
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
            iArr[f5] = m((byte) (255 - (f2 & 255)), gcc.i((int) ((1.402d * d2) + d), 0, 255), gcc.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), gcc.i((int) ((d3 * 1.772d) + d), 0, 255));
            i6 = i2;
            i7 = 0;
            f4 = f4;
            k = k;
            i4 = 8;
            i5 = 2;
        }
        return new gs3(f4, iArr2, i8, k);
    }

    public static is3 r(zd1 zd1Var) {
        byte[] bArr;
        int f = zd1Var.f(16);
        zd1Var.n(4);
        int f2 = zd1Var.f(2);
        boolean e = zd1Var.e();
        zd1Var.n(1);
        byte[] bArr2 = gcc.b;
        if (f2 == 1) {
            zd1Var.n(zd1Var.f(8) << 4);
        } else if (f2 == 0) {
            int f3 = zd1Var.f(16);
            int f4 = zd1Var.f(16);
            if (f3 > 0) {
                bArr2 = new byte[f3];
                zd1Var.i(f3, bArr2);
            }
            if (f4 > 0) {
                bArr = new byte[f4];
                zd1Var.i(f4, bArr);
                return new is3(f, e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new is3(f, e, bArr2, bArr);
    }

    public static void y(FrameLayout frameLayout) {
        i05 i05Var = i05.e;
        Context context = frameLayout.getContext();
        int c = i05Var.c(context, j05.a);
        String b = g7d.b(context, c);
        String c2 = g7d.c(context, c);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        Intent a = i05Var.a(c, context, null);
        if (a != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c2);
            linearLayout.addView(button);
            button.setOnClickListener(new yc3(context, a));
        }
    }

    public final void A(u6d u6dVar) {
        if (((ko9) this.a) != null) {
            u6dVar.b();
            return;
        }
        LinkedList linkedList = (LinkedList) this.b;
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.b = linkedList;
        }
        linkedList.add(u6dVar);
        i09 i09Var = (i09) this.c;
        this.f = i09Var;
        ArrayList arrayList = (ArrayList) this.h;
        Context context = (Context) this.e;
        if (i09Var != null && ((ko9) this.a) == null) {
            try {
                synchronized (tk6.class) {
                    tk6.a(context);
                }
                b1f a0 = m5f.a(context).a0(new br7(context));
                if (a0 != null) {
                    ((i09) this.f).I(new ko9((tt) this.d, a0));
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ko9) this.a).s((z05) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e) {
                p3d.i(e);
            } catch (b15 unused) {
            }
        }
    }

    @Override
    public final Object a(Class cls) {
        return h(h09.a(cls));
    }

    @Override
    public final Set c(h09 h09Var) {
        vw8 vw8Var;
        synchronized (this) {
            vw8Var = (k26) ((HashMap) this.c).get(h09Var);
            if (vw8Var == null) {
                vw8Var = n;
            }
        }
        return (Set) vw8Var.get();
    }

    @Override
    public final vw8 d(Class cls) {
        return g(h09.a(cls));
    }

    public final void e(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            vw8 vw8Var = (vw8) entry.getValue();
            byte b = ((fq2) entry.getKey()).d;
            if (b == 1 || (b == 2 && z)) {
                vw8Var.get();
            }
        }
        w44 w44Var = (w44) this.e;
        synchronized (w44Var) {
            arrayDeque = w44Var.b;
            if (arrayDeque != null) {
                w44Var.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw qu6.l(it);
            }
        }
    }

    @Override
    public final au7 f(h09 h09Var) {
        vw8 g = g(h09Var);
        if (g == null) {
            return new au7(au7.c, au7.d);
        }
        if (g instanceof au7) {
            return (au7) g;
        }
        return new au7(null, g);
    }

    @Override
    public final synchronized vw8 g(h09 h09Var) {
        bwe.a(h09Var, "Null interface requested.");
        return (vw8) ((HashMap) this.b).get(h09Var);
    }

    @Override
    public final Object mo21get() {
        Object obj = new Object();
        z6f z6fVar = new z6f((byte) 28);
        ?? obj2 = new Object();
        obj2.a = (Context) ((pq5) this.a).a;
        obj2.b = (vf7) ((uw8) this.b).mo21get();
        obj2.c = (ds9) ((uw8) this.c).mo21get();
        obj2.d = (pm3) ((ko9) this.d).mo21get();
        obj2.e = (Executor) ((uw8) this.e).mo21get();
        obj2.f = (ds9) ((uw8) this.f).mo21get();
        obj2.g = obj;
        obj2.h = z6fVar;
        obj2.i = (ds9) ((uw8) this.h).mo21get();
        return obj2;
    }

    @Override
    public final Object h(h09 h09Var) {
        vw8 g = g(h09Var);
        if (g == null) {
            return null;
        }
        return g.get();
    }

    @Override
    public final heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    @Override
    public final void l(byte[] bArr, int i, int i2, qeb qebVar, ot2 ot2Var) {
        p43 p43Var;
        SparseArray sparseArray;
        int i3;
        int i4;
        ArrayList arrayList;
        Paint paint;
        int i5;
        int i6;
        SparseArray sparseArray2;
        int i7;
        ks3 ks3Var;
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
        ks3 ks3Var2;
        int i13;
        int i14;
        int i15;
        int i16;
        xq2 xq2Var = this;
        zd1 zd1Var = new zd1(i + i2, bArr);
        zd1Var.l(i);
        Paint paint4 = (Paint) xq2Var.b;
        Canvas canvas = (Canvas) xq2Var.c;
        ms3 ms3Var = (ms3) xq2Var.f;
        SparseArray sparseArray4 = ms3Var.f;
        SparseArray sparseArray5 = ms3Var.g;
        int i17 = ms3Var.b;
        SparseArray sparseArray6 = ms3Var.c;
        SparseArray sparseArray7 = ms3Var.d;
        SparseArray sparseArray8 = ms3Var.e;
        int i18 = ms3Var.a;
        while (zd1Var.b() >= 48 && zd1Var.f(8) == 15) {
            int f = zd1Var.f(8);
            int f2 = zd1Var.f(16);
            int f3 = zd1Var.f(16);
            int d = zd1Var.d() + f3;
            if ((f3 << 3) > zd1Var.b()) {
                efd.f("DvbParser", "Data field length exceeds limit");
                zd1Var.n(zd1Var.b());
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
                            sj0 sj0Var = ms3Var.i;
                            int i19 = 8;
                            zd1Var.f(8);
                            int f4 = zd1Var.f(4);
                            int f5 = zd1Var.f(2);
                            zd1Var.n(2);
                            int i20 = f3 - 2;
                            SparseArray sparseArray9 = new SparseArray();
                            while (i20 > 0) {
                                int f6 = zd1Var.f(i19);
                                zd1Var.n(i19);
                                sparseArray9.put(f6, new js3(zd1Var.f(16), zd1Var.f(16)));
                                i18 = i18;
                                i20 -= 6;
                                i19 = 8;
                            }
                            i12 = i18;
                            sj0 sj0Var2 = new sj0(f4, f5, sparseArray9);
                            if (f5 != 0) {
                                ms3Var.i = sj0Var2;
                                sparseArray6.clear();
                                sparseArray7.clear();
                                sparseArray8.clear();
                                break;
                            } else if (sj0Var != null && sj0Var.b != f4) {
                                ms3Var.i = sj0Var2;
                                break;
                            }
                        }
                        i12 = i18;
                        break;
                    case 17:
                        sj0 sj0Var3 = ms3Var.i;
                        if (f2 == i18 && sj0Var3 != null) {
                            int f7 = zd1Var.f(8);
                            zd1Var.n(4);
                            boolean e = zd1Var.e();
                            zd1Var.n(3);
                            int f8 = zd1Var.f(16);
                            int f9 = zd1Var.f(16);
                            zd1Var.f(3);
                            int f10 = zd1Var.f(3);
                            int i21 = 2;
                            zd1Var.n(2);
                            int f11 = zd1Var.f(8);
                            int f12 = zd1Var.f(8);
                            int f13 = zd1Var.f(4);
                            int f14 = zd1Var.f(2);
                            zd1Var.n(2);
                            int i22 = f3 - 10;
                            SparseArray sparseArray10 = new SparseArray();
                            while (i22 > 0) {
                                int i23 = i17;
                                int i24 = i22;
                                int f15 = zd1Var.f(16);
                                int f16 = zd1Var.f(i21);
                                zd1Var.f(i21);
                                Paint paint5 = paint4;
                                int f17 = zd1Var.f(12);
                                SparseArray sparseArray11 = sparseArray5;
                                zd1Var.n(4);
                                int f18 = zd1Var.f(12);
                                int i25 = i24 - 6;
                                if (f16 == 1 || f16 == 2) {
                                    zd1Var.f(8);
                                    zd1Var.f(8);
                                    i25 = i24 - 8;
                                }
                                sparseArray10.put(f15, new ls3(f17, f18));
                                i22 = i25;
                                i17 = i23;
                                paint4 = paint5;
                                sparseArray5 = sparseArray11;
                                i21 = 2;
                            }
                            sparseArray3 = sparseArray5;
                            i11 = i17;
                            paint3 = paint4;
                            ks3 ks3Var3 = new ks3(f7, e, f8, f9, f10, f11, f12, f13, f14, sparseArray10);
                            if (sj0Var3.c == 0 && (ks3Var2 = (ks3) sparseArray6.get(f7)) != null) {
                                SparseArray sparseArray12 = ks3Var2.j;
                                for (int i26 = 0; i26 < sparseArray12.size(); i26++) {
                                    ks3Var3.j.put(sparseArray12.keyAt(i26), (ls3) sparseArray12.valueAt(i26));
                                }
                            }
                            sparseArray6.put(ks3Var3.a, ks3Var3);
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
                            gs3 q = q(zd1Var, f3);
                            sparseArray7.put(q.a, q);
                        } else if (f2 == i17) {
                            gs3 q2 = q(zd1Var, f3);
                            sparseArray4.put(q2.a, q2);
                        }
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                    case 19:
                        if (f2 == i18) {
                            is3 r2 = r(zd1Var);
                            sparseArray8.put(r2.a, r2);
                        } else if (f2 == i17) {
                            is3 r3 = r(zd1Var);
                            sparseArray5.put(r3.a, r3);
                        }
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                    case 20:
                        if (f2 == i18) {
                            zd1Var.n(4);
                            boolean e2 = zd1Var.e();
                            zd1Var.n(3);
                            int f19 = zd1Var.f(16);
                            int f20 = zd1Var.f(16);
                            if (e2) {
                                int f21 = zd1Var.f(16);
                                int f22 = zd1Var.f(16);
                                int f23 = zd1Var.f(16);
                                i13 = f22;
                                i14 = zd1Var.f(16);
                                i16 = f23;
                                i15 = f21;
                            } else {
                                i13 = f19;
                                i14 = f20;
                                i15 = 0;
                                i16 = 0;
                            }
                            ms3Var.h = new hs3(f19, f20, i15, i13, i16, i14);
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
                zd1Var.o(d - zd1Var.d());
            }
            i18 = i12;
            i17 = i11;
            paint4 = paint3;
            sparseArray5 = sparseArray3;
        }
        SparseArray sparseArray13 = sparseArray5;
        Paint paint6 = paint4;
        sj0 sj0Var4 = ms3Var.i;
        if (sj0Var4 == null) {
            no5 no5Var = po5.b;
            p43Var = new p43(-9223372036854775807L, -9223372036854775807L, j99.e);
        } else {
            hs3 hs3Var = ms3Var.h;
            if (hs3Var == null) {
                hs3Var = (hs3) xq2Var.d;
            }
            int i27 = hs3Var.b;
            int i28 = hs3Var.a;
            Bitmap bitmap = (Bitmap) xq2Var.h;
            if (bitmap == null || i28 + 1 != bitmap.getWidth() || i27 + 1 != ((Bitmap) xq2Var.h).getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(i28 + 1, i27 + 1, Bitmap.Config.ARGB_8888);
                xq2Var.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray14 = (SparseArray) sj0Var4.d;
            int i29 = 0;
            while (i29 < sparseArray14.size()) {
                canvas.save();
                js3 js3Var = (js3) sparseArray14.valueAt(i29);
                ks3 ks3Var4 = (ks3) sparseArray6.get(sparseArray14.keyAt(i29));
                int i30 = js3Var.a + hs3Var.c;
                int i31 = js3Var.b + hs3Var.e;
                int i32 = ks3Var4.c;
                int i33 = ks3Var4.f;
                SparseArray sparseArray15 = sparseArray14;
                int i34 = ks3Var4.d;
                int i35 = i27;
                int i36 = i30 + i32;
                int i37 = i28;
                SparseArray sparseArray16 = sparseArray6;
                int i38 = i31 + i34;
                int i39 = i29;
                canvas.clipRect(i30, i31, Math.min(i36, hs3Var.d), Math.min(i38, hs3Var.f));
                gs3 gs3Var = (gs3) sparseArray7.get(i33);
                if (gs3Var == null && (gs3Var = (gs3) sparseArray4.get(i33)) == null) {
                    gs3Var = (gs3) xq2Var.e;
                }
                int[] iArr3 = gs3Var.b;
                int[] iArr4 = gs3Var.c;
                int[] iArr5 = gs3Var.d;
                hs3 hs3Var2 = hs3Var;
                SparseArray sparseArray17 = ks3Var4.j;
                SparseArray sparseArray18 = sparseArray4;
                int i40 = 0;
                while (i40 < sparseArray17.size()) {
                    int keyAt = sparseArray17.keyAt(i40);
                    SparseArray sparseArray19 = sparseArray17;
                    ls3 ls3Var = (ls3) sparseArray17.valueAt(i40);
                    is3 is3Var = (is3) sparseArray8.get(keyAt);
                    int i41 = i40;
                    SparseArray sparseArray20 = sparseArray13;
                    if (is3Var == null) {
                        is3Var = (is3) sparseArray20.get(keyAt);
                    }
                    is3 is3Var2 = is3Var;
                    if (is3Var2 != null) {
                        sparseArray13 = sparseArray20;
                        if (is3Var2.b) {
                            paint2 = null;
                        } else {
                            paint2 = (Paint) xq2Var.a;
                        }
                        Paint paint7 = paint2;
                        ks3 ks3Var5 = ks3Var4;
                        int i42 = ks3Var5.e;
                        int i43 = ls3Var.a + i30;
                        int i44 = ls3Var.b + i31;
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
                        ks3Var = ks3Var5;
                        iArr = iArr4;
                        i6 = i34;
                        i7 = i10;
                        p(is3Var2.c, iArr2, i42, i43, i44, paint7, canvas);
                        p(is3Var2.d, iArr2, i42, i43, i44 + 1, paint7, canvas);
                    } else {
                        i6 = i34;
                        sparseArray13 = sparseArray20;
                        sparseArray2 = sparseArray8;
                        i7 = i31;
                        ks3Var = ks3Var4;
                        i8 = i30;
                        i9 = i32;
                        iArr = iArr4;
                    }
                    xq2Var = this;
                    i30 = i8;
                    i31 = i7;
                    ks3Var4 = ks3Var;
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
                ks3 ks3Var6 = ks3Var4;
                int i47 = i30;
                int i48 = i32;
                int[] iArr6 = iArr4;
                if (ks3Var6.b) {
                    int i49 = ks3Var6.e;
                    if (i49 == 3) {
                        i5 = iArr5[ks3Var6.g];
                    } else if (i49 == 2) {
                        i5 = iArr6[ks3Var6.h];
                    } else {
                        i5 = iArr3[ks3Var6.i];
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
                arrayList.add(new m43(null, null, null, createBitmap2, f26 / f27, 0, 0, f25, 0, Integer.MIN_VALUE, -3.4028235E38f, i48 / f24, i45 / f27, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                xq2Var = this;
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
                hs3Var = hs3Var2;
            }
            p43Var = new p43(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        ot2Var.accept(p43Var);
    }

    public final void n() {
        x(null);
        fu5 fu5Var = (fu5) this.c;
        if (fu5Var != null) {
            fu5Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void o(boolean z) {
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
        e(hashMap, z);
    }

    @Override
    public final void reset() {
        ms3 ms3Var = (ms3) this.f;
        ms3Var.c.clear();
        ms3Var.d.clear();
        ms3Var.e.clear();
        ms3Var.f.clear();
        ms3Var.g.clear();
        ms3Var.h = null;
        ms3Var.i = null;
    }

    @Override
    public final int s() {
        return 2;
    }

    public final void t(km9 km9Var, ArrayList arrayList) {
        vnb vnbVar = (vnb) this.b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                kf9 kf9Var = (kf9) obj;
                d19 d19Var = new d19(km9Var.getContext(), kf9Var, vnbVar);
                d19Var.setPadding(hl.L(8.0f), 0, hl.L(12.0f), 0);
                d19Var.setBackground(aob.Y(aob.v0(aob.i6, vnbVar), 0, 0));
                d19Var.setOnClickListener(new lw4(this, km9Var, kf9Var, (byte) 18));
                ((LinearLayout) this.d).addView(d19Var, tre.o(-1, 48));
            }
        }
    }

    public final void u() {
        boolean z;
        HashMap hashMap = (HashMap) this.b;
        HashMap hashMap2 = (HashMap) this.c;
        for (fq2 fq2Var : ((HashMap) this.a).keySet()) {
            for (qe3 qe3Var : fq2Var.c) {
                if (qe3Var.b == 2) {
                    z = true;
                } else {
                    z = false;
                }
                h09 h09Var = qe3Var.a;
                if (z && !hashMap2.containsKey(h09Var)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.b = null;
                    obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.a.addAll(set);
                    hashMap2.put(h09Var, obj);
                } else if (hashMap.containsKey(h09Var)) {
                    continue;
                } else {
                    byte b = qe3Var.b;
                    if (b != 1) {
                        if (b != 2) {
                            hashMap.put(h09Var, new au7(au7.c, au7.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + fq2Var + ": " + h09Var);
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
            fq2 fq2Var = (fq2) obj;
            if (!fq2Var.e) {
                vw8 vw8Var = (vw8) ((HashMap) this.a).get(fq2Var);
                for (h09 h09Var : fq2Var.b) {
                    if (!hashMap.containsKey(h09Var)) {
                        hashMap.put(h09Var, vw8Var);
                    } else {
                        arrayList2.add(new ea2((au7) ((vw8) hashMap.get(h09Var)), vw8Var, (byte) 23));
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
            fq2 fq2Var = (fq2) entry.getKey();
            if (fq2Var.e) {
                vw8 vw8Var = (vw8) entry.getValue();
                for (h09 h09Var : fq2Var.b) {
                    if (!hashMap2.containsKey(h09Var)) {
                        hashMap2.put(h09Var, new HashSet());
                    }
                    ((Set) hashMap2.get(h09Var)).add(vw8Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                ?? obj = new Object();
                obj.b = null;
                obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((h09) entry2.getKey(), obj);
            } else {
                k26 k26Var = (k26) hashMap.get(entry2.getKey());
                for (vw8 vw8Var2 : (Set) entry2.getValue()) {
                    arrayList.add(new ea2(k26Var, vw8Var2, (byte) 24));
                }
            }
        }
        return arrayList;
    }

    public final void x(km9 km9Var) {
        km9 km9Var2 = (km9) this.h;
        if (km9Var2 != km9Var) {
            if (km9Var2 != null) {
                km9Var2.setShowCommandBackground(false);
            }
            this.h = km9Var;
            if (km9Var != null) {
                km9Var.setShowCommandBackground(true);
            }
        }
    }

    public final void z(km9 km9Var, String str) {
        fu5 fu5Var;
        fu5 fu5Var2;
        if (str == null) {
            n();
            return;
        }
        ArrayList a = kf9.a(str);
        if (a.isEmpty()) {
            n();
            return;
        }
        x(km9Var);
        if (((km9) this.f) == km9Var && a.equals((ArrayList) this.e) && (fu5Var2 = (fu5) this.c) != null && fu5Var2.E()) {
            return;
        }
        if (((km9) this.f) == km9Var && (fu5Var = (fu5) this.c) != null && fu5Var.E() && ((LinearLayout) this.d) != null) {
            this.e = a;
            t(km9Var, a);
            ((fu5) this.c).P();
            return;
        }
        n();
        x(km9Var);
        this.f = km9Var;
        this.e = a;
        LinearLayout linearLayout = new LinearLayout(km9Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        t(km9Var, a);
        fu5 i = ((lf9) this.a).i(km9Var.getEditText());
        i.W = true;
        i.s = (short) 0;
        i.t = false;
        i.q((LinearLayout) this.d, tre.o(220, -2));
        i.d0 = hl.L(240.0f);
        i.i = (byte) 3;
        i.b0(-hl.L(12.0f), 0.0f);
        i.p = new v59(this, (byte) 6);
        i.j0 = true;
        if (i.E()) {
            i.D();
        }
        i.a0();
        this.c = i;
    }

    public xq2(lf9 lf9Var, vnb vnbVar) {
        this.a = lf9Var;
        this.b = vnbVar;
    }
}
