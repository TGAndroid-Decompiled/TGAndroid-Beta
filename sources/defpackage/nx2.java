package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.a;
public final class nx2 extends j39 {
    public final Context r;
    public final HashMap s = new HashMap();
    public final ArrayList w = new ArrayList();
    public final qx2 x;

    public nx2(qx2 qx2Var, Context context, ArrayList arrayList, boolean z) {
        Comparator saVar;
        Locale locale;
        this.x = qx2Var;
        this.r = context;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                mx2 mx2Var = (mx2) arrayList.get(i);
                String upperCase = mx2Var.a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.s.put(upperCase, arrayList2);
                    this.w.add(upperCase);
                }
                arrayList2.add(mx2Var);
            }
        } else {
            try {
                InputStream open = a.b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.a = split[2];
                    obj.c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z) {
                        String upperCase2 = obj.a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.s.put(upperCase2, arrayList3);
                            this.w.add(upperCase2);
                        }
                        arrayList3.add(obj);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (k96.D0().y != null) {
                locale = k96.D0().y;
            } else {
                locale = Locale.getDefault();
            }
            Collator collator = Collator.getInstance(locale);
            Objects.requireNonNull(collator);
            saVar = new in0(collator, (byte) 0);
        } else {
            saVar = new sa((byte) 9);
        }
        Collections.sort(this.w, saVar);
        for (ArrayList arrayList4 : this.s.values()) {
            Collections.sort(arrayList4, new jn0(saVar, (byte) 2));
        }
    }

    @Override
    public final String F(int i) {
        int S = S(i);
        ArrayList arrayList = this.w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override
    public final void G(o39 o39Var, float f, int[] iArr) {
        iArr[0] = (int) (b() * f);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i) {
        ArrayList arrayList = this.w;
        int size = ((ArrayList) this.s.get(arrayList.get(i))).size();
        if (i != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i, int i2) {
        if (i2 < ((ArrayList) this.s.get(this.w.get(i))).size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final int R() {
        return this.w.size();
    }

    @Override
    public final View T(int i, View view) {
        return null;
    }

    @Override
    public final boolean V(int i, int i2, s49 s49Var) {
        if (i2 < ((ArrayList) this.s.get(this.w.get(i))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i, int i2, s49 s49Var) {
        if (s49Var.f == 0) {
            mx2 mx2Var = (mx2) ((ArrayList) this.s.get(this.w.get(i))).get(i2);
            uib uibVar = (uib) s49Var.a;
            String str = null;
            CharSequence m = vu3.m(qx2.Z(mx2Var), uibVar.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.x.h) {
                str = "+" + mx2Var.c;
            }
            uibVar.c(m, str, false, false);
        }
    }

    @Override
    public final mx2 O(int i, int i2) {
        if (i >= 0) {
            ArrayList arrayList = this.w;
            if (i < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.s.get(arrayList.get(i));
                if (i2 >= 0 && i2 < arrayList2.size()) {
                    return (mx2) arrayList2.get(i2);
                }
            }
        }
        return null;
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View Y;
        Context context = this.r;
        if (i != 0) {
            Y = new qo3(context, null);
            Y.setPadding(gl.L(24.0f), gl.L(8.0f), gl.L(24.0f), gl.L(8.0f));
        } else {
            Y = qx2.Y(context);
        }
        return new s49(Y);
    }
}
