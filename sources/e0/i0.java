package e0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.jy0;

public final class i0 implements w3.y {

    public int f5064a;

    public final Object f5065b;

    public final Object f5066c;
    public final Object d;

    public final Object f5067e;

    public i0(int i10) {
        this.f5064a = i10;
        int i11 = i10 * 8;
        this.f5065b = new float[i11];
        this.f5066c = new float[i11];
        this.d = new short[i10 * 6];
        this.f5067e = new int[i10 * 4];
        for (short s10 = 0; s10 < i10; s10 = (short) (s10 + 1)) {
            int i12 = s10 * 6;
            int i13 = s10 * 4;
            short[] sArr = (short[]) this.d;
            short s11 = (short) i13;
            sArr[i12] = s11;
            sArr[i12 + 1] = (short) (i13 + 1);
            short s12 = (short) (i13 + 2);
            sArr[i12 + 2] = s12;
            sArr[i12 + 3] = s12;
            sArr[i12 + 4] = (short) (i13 + 3);
            sArr[i12 + 5] = s11;
        }
    }

    public static void c(float[] fArr, int i10, float f10, float f11, float f12, float f13) {
        int i11 = i10 * 8;
        fArr[i11] = f10;
        fArr[i11 + 1] = f11;
        fArr[i11 + 2] = f12;
        fArr[i11 + 3] = f11;
        fArr[i11 + 4] = f12;
        fArr[i11 + 5] = f13;
        fArr[i11 + 6] = f10;
        fArr[i11 + 7] = f13;
    }

    public static void d(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override
    public void b(d5.z zVar) {
        d5.f0 f0Var;
        SparseArray sparseArray;
        d5.f0 f0Var2;
        int i10;
        int i11;
        SparseArray sparseArray2;
        SparseArray sparseArray3 = (SparseArray) this.f5066c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        d5.y yVar = (d5.y) this.f5065b;
        w3.c0 c0Var = (w3.c0) this.f5067e;
        SparseArray sparseArray4 = c0Var.f49007f;
        SparseBooleanArray sparseBooleanArray = c0Var.f49008g;
        o0.i iVar = c0Var.f49006e;
        List list = c0Var.f49004b;
        int i12 = c0Var.f49003a;
        if (zVar.r() != 2) {
            return;
        }
        if (i12 == 1 || i12 == 2 || c0Var.f49012l == 1) {
            f0Var = (d5.f0) list.get(0);
        } else {
            f0Var = new d5.f0(((d5.f0) list.get(0)).c());
            list.add(f0Var);
        }
        if ((zVar.r() & 128) == 0) {
            return;
        }
        zVar.D(1);
        int iW = zVar.w();
        zVar.D(3);
        zVar.c(0, 2, yVar.f4853b);
        yVar.p(0);
        yVar.s(3);
        c0Var.f49018r = yVar.i(13);
        zVar.c(0, 2, yVar.f4853b);
        yVar.p(0);
        yVar.s(4);
        zVar.D(yVar.i(12));
        if (i12 == 2 && c0Var.f49016p == null) {
            w3.f0 f0VarA = iVar.a(21, new u2.b(21, (String) null, (ArrayList) null, d5.g0.f4799f));
            c0Var.f49016p = f0VarA;
            if (f0VarA != null) {
                f0VarA.a(f0Var, c0Var.f49011k, new w3.e0(iW, 21, 8192));
            }
        }
        sparseArray3.clear();
        sparseIntArray.clear();
        int iA = zVar.a();
        while (iA > 0) {
            zVar.c(0, 5, yVar.f4853b);
            yVar.p(0);
            int i13 = yVar.i(8);
            yVar.s(3);
            int i14 = yVar.i(13);
            yVar.s(4);
            int i15 = yVar.i(12);
            int i16 = zVar.f4859b;
            int i17 = i16 + i15;
            int i18 = iA;
            d5.y yVar2 = yVar;
            SparseArray sparseArray5 = sparseArray4;
            d5.f0 f0Var3 = f0Var;
            int i19 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (true) {
                if (zVar.f4859b >= i17) {
                    i11 = iW;
                    break;
                }
                int iR = zVar.r();
                i11 = iW;
                int iR2 = zVar.f4859b + zVar.r();
                if (iR2 > i17) {
                    break;
                }
                SparseArray sparseArray6 = sparseArray3;
                if (iR == 5) {
                    long jS = zVar.s();
                    if (jS == 1094921523) {
                        i19 = 129;
                    } else if (jS == 1161904947) {
                        i19 = 135;
                    } else if (jS == 1094921524) {
                        i19 = 172;
                    } else if (jS == 1212503619) {
                        i19 = 36;
                    }
                } else if (iR == 106) {
                    i19 = 129;
                } else if (iR == 122) {
                    i19 = 135;
                } else if (iR == 127) {
                    if (zVar.r() == 21) {
                        i19 = 172;
                    }
                } else if (iR == 123) {
                    i19 = 138;
                } else if (iR == 10) {
                    strTrim = zVar.p(3, o8.d.f19363c).trim();
                } else if (iR == 89) {
                    arrayList = new ArrayList();
                    while (zVar.f4859b < iR2) {
                        String strTrim2 = zVar.p(3, o8.d.f19363c).trim();
                        zVar.r();
                        byte[] bArr = new byte[4];
                        zVar.c(0, 4, bArr);
                        arrayList.add(new w3.d0(strTrim2, bArr));
                        iR2 = iR2;
                    }
                    iR2 = iR2;
                    i19 = 89;
                } else {
                    iR2 = iR2;
                    if (iR == 111) {
                        i19 = 257;
                    }
                }
                zVar.D(iR2 - zVar.f4859b);
                iW = i11;
                sparseArray3 = sparseArray6;
            }
            SparseArray sparseArray7 = sparseArray3;
            zVar.C(i17);
            u2.b bVar = new u2.b(i19, strTrim, arrayList, Arrays.copyOfRange(zVar.f4858a, i16, i17));
            if (i13 == 6 || i13 == 5) {
                i13 = i19;
            }
            iA = i18 - (i15 + 5);
            int i20 = i12 == 2 ? i13 : i14;
            if (sparseBooleanArray.get(i20)) {
                sparseArray2 = sparseArray7;
            } else {
                w3.f0 f0VarA2 = (i12 == 2 && i13 == 21) ? c0Var.f49016p : iVar.a(i13, bVar);
                if (i12 != 2 || i14 < sparseIntArray.get(i20, 8192)) {
                    sparseIntArray.put(i20, i14);
                    sparseArray2 = sparseArray7;
                    sparseArray2.put(i20, f0VarA2);
                } else {
                    sparseArray2 = sparseArray7;
                }
            }
            sparseArray3 = sparseArray2;
            yVar = yVar2;
            sparseArray4 = sparseArray5;
            f0Var = f0Var3;
            iW = i11;
        }
        SparseArray sparseArray8 = sparseArray4;
        int i21 = iW;
        d5.f0 f0Var4 = f0Var;
        SparseArray sparseArray9 = sparseArray3;
        int size = sparseIntArray.size();
        int i22 = 0;
        while (i22 < size) {
            int iKeyAt = sparseIntArray.keyAt(i22);
            int iValueAt = sparseIntArray.valueAt(i22);
            sparseBooleanArray.put(iKeyAt, true);
            c0Var.h.put(iValueAt, true);
            w3.f0 f0Var5 = (w3.f0) sparseArray9.valueAt(i22);
            if (f0Var5 != null) {
                if (f0Var5 != c0Var.f49016p) {
                    i10 = i21;
                    f0Var2 = f0Var4;
                    f0Var5.a(f0Var2, c0Var.f49011k, new w3.e0(i10, iKeyAt, 8192));
                } else {
                    f0Var2 = f0Var4;
                    i10 = i21;
                }
                sparseArray = sparseArray8;
                sparseArray.put(iValueAt, f0Var5);
            } else {
                sparseArray = sparseArray8;
                f0Var2 = f0Var4;
                i10 = i21;
            }
            i22++;
            sparseArray8 = sparseArray;
            i21 = i10;
            f0Var4 = f0Var2;
        }
        SparseArray sparseArray10 = sparseArray8;
        if (i12 == 2) {
            if (c0Var.f49013m) {
                return;
            }
            c0Var.f49011k.A();
            c0Var.f49012l = 0;
            c0Var.f49013m = true;
            return;
        }
        sparseArray10.remove(this.f5064a);
        int i23 = i12 == 1 ? 0 : c0Var.f49012l - 1;
        c0Var.f49012l = i23;
        if (i23 == 0) {
            c0Var.f49011k.A();
            c0Var.f49013m = true;
        }
    }

    public void e(int i10, int i11) {
        int[] iArr = (int[]) this.f5067e;
        int i12 = i10 * 4;
        iArr[i12] = i11;
        iArr[i12 + 1] = i11;
        iArr[i12 + 2] = i11;
        iArr[i12 + 3] = i11;
    }

    public void f(int i10) {
        int[] iArr = (int[]) this.d;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (hy0 hy0Var : ((hy0[][]) this.f5066c)[i10]) {
            f(hy0Var.f29179a.f31062b);
            hy0[] hy0VarArr = (hy0[]) this.f5065b;
            int i11 = this.f5064a;
            this.f5064a = i11 - 1;
            hy0VarArr[i11] = hy0Var;
        }
        iArr[i10] = 2;
    }

    public i0(t tVar) {
        int i10;
        Notification.BubbleMetadata bubbleMetadata;
        Notification.BubbleMetadata bubbleMetadataA;
        Bundle bundle;
        Bundle[] bundleArr;
        ArrayList arrayList;
        Notification.Action.Builder builder;
        Bundle bundle2;
        new ArrayList();
        this.f5067e = new Bundle();
        this.d = tVar;
        Context context = tVar.f5118a;
        ArrayList arrayList2 = tVar.F;
        ArrayList arrayList3 = tVar.f5120c;
        ArrayList arrayList4 = tVar.d;
        this.f5065b = context;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f5066c = h6.a.a(context, tVar.f5139y);
        } else {
            this.f5066c = new Notification.Builder(context);
        }
        Notification notification = tVar.E;
        ((Notification.Builder) this.f5066c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(tVar.f5121e).setContentText(tVar.f5122f).setContentInfo(null).setContentIntent(tVar.f5123g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(tVar.f5124i).setProgress(tVar.f5129n, tVar.f5130o, tVar.f5131p);
        if (i11 < 23) {
            Notification.Builder builder2 = (Notification.Builder) this.f5066c;
            IconCompat iconCompat = tVar.h;
            builder2.setLargeIcon(iconCompat == null ? null : iconCompat.f());
        } else {
            Notification.Builder builder3 = (Notification.Builder) this.f5066c;
            IconCompat iconCompat2 = tVar.h;
            b.v(builder3, iconCompat2 == null ? null : iconCompat2.m(context));
        }
        ((Notification.Builder) this.f5066c).setSubText(tVar.f5128m).setUsesChronometer(false).setPriority(tVar.f5125j);
        ArrayList arrayList5 = tVar.f5119b;
        int size = arrayList5.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList5.get(i12);
            int i13 = i12 + 1;
            k kVar = (k) obj;
            int i14 = Build.VERSION.SDK_INT;
            IconCompat iconCompatA = kVar.a();
            int i15 = kVar.f5081f;
            boolean z10 = kVar.d;
            Bundle bundle3 = kVar.f5077a;
            ArrayList arrayList6 = arrayList5;
            PendingIntent pendingIntent = kVar.f5083i;
            int i16 = size;
            CharSequence charSequence = kVar.h;
            if (i14 >= 23) {
                builder = b.b(iconCompatA != null ? iconCompatA.m(null) : null, charSequence, pendingIntent);
            } else {
                builder = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.g() : 0, charSequence, pendingIntent);
            }
            r0[] r0VarArr = kVar.f5079c;
            if (r0VarArr != null) {
                for (RemoteInput remoteInput : r0.a(r0VarArr)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 24) {
                androidx.emoji2.text.v.h(builder, z10);
            }
            bundle2.putInt("android.support.action.semanticAction", i15);
            if (i17 >= 28) {
                d1.f.x(builder, i15);
            }
            if (i17 >= 29) {
                com.google.firebase.messaging.q.g(builder);
            }
            if (i17 >= 31) {
                h0.a(builder);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", kVar.f5080e);
            builder.addExtras(bundle2);
            ((Notification.Builder) this.f5066c).addAction(builder.build());
            arrayList5 = arrayList6;
            size = i16;
            i12 = i13;
        }
        Bundle bundle4 = tVar.v;
        if (bundle4 != null) {
            ((Bundle) this.f5067e).putAll(bundle4);
        }
        int i18 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f5066c).setShowWhen(tVar.f5126k);
        ((Notification.Builder) this.f5066c).setLocalOnly(tVar.f5135t);
        ((Notification.Builder) this.f5066c).setGroup(tVar.f5132q);
        ((Notification.Builder) this.f5066c).setSortKey(tVar.f5134s);
        ((Notification.Builder) this.f5066c).setGroupSummary(tVar.f5133r);
        this.f5064a = tVar.B;
        ((Notification.Builder) this.f5066c).setCategory(tVar.f5136u);
        ((Notification.Builder) this.f5066c).setColor(tVar.f5137w);
        ((Notification.Builder) this.f5066c).setVisibility(tVar.f5138x);
        ((Notification.Builder) this.f5066c).setPublicVersion(null);
        ((Notification.Builder) this.f5066c).setSound(notification.sound, notification.audioAttributes);
        if (i18 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj2 = arrayList3.get(i19);
                    i19++;
                    p0 p0Var = (p0) obj2;
                    CharSequence charSequence2 = p0Var.f5106a;
                    String str = p0Var.f5108c;
                    if (str == null) {
                        str = charSequence2 != null ? "name:" + ((Object) charSequence2) : "";
                    }
                    arrayList.add(str);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    a0.g gVar = new a0.g(arrayList2.size() + arrayList.size());
                    gVar.addAll(arrayList);
                    gVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(gVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i20 = 0;
            while (i20 < size3) {
                Object obj3 = arrayList2.get(i20);
                i20++;
                ((Notification.Builder) this.f5066c).addPerson((String) obj3);
            }
        }
        if (arrayList4.size() > 0) {
            if (tVar.v == null) {
                tVar.v = new Bundle();
            }
            Bundle bundle5 = tVar.v.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i21 = 0;
            while (i21 < arrayList4.size()) {
                String string = Integer.toString(i21);
                k kVar2 = (k) arrayList4.get(i21);
                Bundle bundle8 = new Bundle();
                IconCompat iconCompatA2 = kVar2.a();
                Bundle bundle9 = kVar2.f5077a;
                bundle8.putInt("icon", iconCompatA2 != null ? iconCompatA2.g() : 0);
                bundle8.putCharSequence("title", kVar2.h);
                bundle8.putParcelable("actionIntent", kVar2.f5083i);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", kVar2.d);
                bundle8.putBundle("extras", bundle);
                r0[] r0VarArr2 = kVar2.f5079c;
                if (r0VarArr2 == null) {
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[r0VarArr2.length];
                    int i22 = 0;
                    while (i22 < r0VarArr2.length) {
                        r0 r0Var = r0VarArr2[i22];
                        int i23 = i22;
                        Bundle bundle10 = new Bundle();
                        r0Var.getClass();
                        r0[] r0VarArr3 = r0VarArr2;
                        Bundle[] bundleArr3 = bundleArr2;
                        bundle10.putString("resultKey", "extra_voice_reply");
                        bundle10.putCharSequence("label", r0Var.f5115a);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", true);
                        bundle10.putBundle("extras", r0Var.f5116b);
                        HashSet hashSet = r0Var.f5117c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList7 = new ArrayList<>(hashSet.size());
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                arrayList7.add((String) it.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList7);
                        }
                        bundleArr3[i23] = bundle10;
                        i22 = i23 + 1;
                        r0VarArr2 = r0VarArr3;
                        bundleArr2 = bundleArr3;
                    }
                    bundleArr = bundleArr2;
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", kVar2.f5080e);
                bundle8.putInt("semanticAction", kVar2.f5081f);
                bundle7.putBundle(string, bundle8);
                i21++;
                arrayList4 = arrayList4;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (tVar.v == null) {
                tVar.v = new Bundle();
            }
            tVar.v.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f5067e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i24 = Build.VERSION.SDK_INT;
        if (i24 >= 24) {
            ((Notification.Builder) this.f5066c).setExtras(tVar.v);
            androidx.emoji2.text.v.i((Notification.Builder) this.f5066c);
        }
        if (i24 >= 26) {
            h6.a.h((Notification.Builder) this.f5066c);
            h6.a.n((Notification.Builder) this.f5066c);
            h6.a.o((Notification.Builder) this.f5066c, tVar.f5140z);
            h6.a.p((Notification.Builder) this.f5066c);
            h6.a.j((Notification.Builder) this.f5066c, tVar.B);
            if (TextUtils.isEmpty(tVar.f5139y)) {
                i10 = 0;
                bubbleMetadata = null;
            } else {
                bubbleMetadata = null;
                i10 = 0;
                ((Notification.Builder) this.f5066c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        } else {
            i10 = 0;
            bubbleMetadata = null;
        }
        if (i24 >= 28) {
            int size4 = arrayList3.size();
            while (i10 < size4) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                p0 p0Var2 = (p0) obj4;
                Notification.Builder builder4 = (Notification.Builder) this.f5066c;
                p0Var2.getClass();
                d1.f.a(builder4, d1.f.D(p0Var2));
            }
        }
        int i25 = Build.VERSION.SDK_INT;
        if (i25 >= 29) {
            com.google.firebase.messaging.q.e((Notification.Builder) this.f5066c, tVar.C);
            Notification.Builder builder5 = (Notification.Builder) this.f5066c;
            r rVar = tVar.D;
            if (rVar == null) {
                bubbleMetadataA = bubbleMetadata;
            } else if (i25 >= 30) {
                bubbleMetadataA = q.a(rVar);
            } else if (i25 == 29) {
                bubbleMetadataA = p.a(rVar);
            } else {
                bubbleMetadataA = bubbleMetadata;
            }
            com.google.firebase.messaging.q.f(builder5, bubbleMetadataA);
            f0.h hVar = tVar.A;
            if (hVar != null) {
                com.google.firebase.messaging.q.i((Notification.Builder) this.f5066c, hVar.f5602b);
            }
        }
    }

    @Override
    public void a(d5.f0 f0Var, m3.m mVar, w3.e0 e0Var) {
    }

    public i0(j3.o0 o0Var, m3.y yVar, byte[] bArr, d5.c[] cVarArr, int i10) {
        this.f5065b = o0Var;
        this.f5066c = yVar;
        this.d = bArr;
        this.f5067e = cVarArr;
        this.f5064a = i10;
    }

    public i0(w3.c0 c0Var, int i10) {
        this.f5067e = c0Var;
        this.f5065b = new d5.y(new byte[5], 5);
        this.f5066c = new SparseArray();
        this.d = new SparseIntArray();
        this.f5064a = i10;
    }

    public i0(jy0 jy0Var, hy0[] hy0VarArr) {
        this.f5067e = jy0Var;
        int length = hy0VarArr.length;
        this.f5065b = new hy0[length];
        this.f5064a = length - 1;
        int iE = jy0Var.e() + 1;
        hy0[][] hy0VarArr2 = new hy0[iE][];
        int[] iArr = new int[iE];
        for (hy0 hy0Var : hy0VarArr) {
            int i10 = hy0Var.f29179a.f31061a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < iE; i11++) {
            hy0VarArr2[i11] = new hy0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (hy0 hy0Var2 : hy0VarArr) {
            int i12 = hy0Var2.f29179a.f31061a;
            hy0[] hy0VarArr3 = hy0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            hy0VarArr3[i13] = hy0Var2;
        }
        this.f5066c = hy0VarArr2;
        this.d = new int[((jy0) this.f5067e).e() + 1];
    }
}
