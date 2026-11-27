package defpackage;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
public final class sl7 extends nx0 implements AdapterView.OnItemSelectedListener {
    public boolean A1;
    public String B1;
    public boolean C1;
    public String D1;
    public String E1;
    public final e F1;
    public final int G1;
    public final rl7 H1;
    public final View I1;
    public final rl7 J1;
    public final ImageView K1;
    public final og2 L1;
    public final TextView M1;
    public final LinearLayout N1;
    public int O1;
    public final fx0 P1;
    public final TextView Q1;
    public final RadialProgressView R1;
    public final FrameLayout S1;
    public final TextView T1;
    public String U1;
    public int V1;
    public int W1;
    public boolean X1;
    public final LinearLayout l1;
    public final ju7 m1;
    public final ju7 n1;
    public final FrameLayout o1;
    public final View p1;
    public final c51 q1;
    public final ju7 r1;
    public final lu7 s1;
    public final p66 t1;
    public final ArrayList u1;
    public final HashMap v1;
    public final HashMap w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;

    public sl7(org.telegram.ui.ActionBar.e r25, android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl7.<init>(org.telegram.ui.ActionBar.e, android.content.Context):void");
    }

    public static String F0(LaunchActivity launchActivity, TLRPC.User user, String str) {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(launchActivity.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                hashMap.put(split[0], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (!str.startsWith("+")) {
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                String str2 = user.phone;
                for (int i = 4; i >= 1; i--) {
                    String substring = str2.substring(0, i);
                    if (((String) hashMap.get(substring)) != null) {
                        return qd4.y("+", substring, str);
                    }
                }
            } else {
                return "+".concat(str);
            }
        }
        return str;
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.E7));
        hashSet.add(Integer.valueOf(aob.D7));
        hashSet.add(Integer.valueOf(aob.l6));
        hashSet.add(Integer.valueOf(aob.H6));
    }

    public final void E0() {
        String str;
        this.A1 = true;
        hl.T3(this.Q1, false, 0.5f, true, true);
        hl.T3(this.R1, true, 0.5f, true, true);
        String str2 = "+" + this.H1.getText().toString() + this.J1.getText().toString();
        String obj = this.m1.getEditText().getText().toString();
        String obj2 = this.n1.getEditText().getText().toString();
        ju7 ju7Var = this.r1;
        if (ju7Var.getVisibility() == 0) {
            str = ju7Var.getEditText().getText().toString();
        } else {
            str = "";
        }
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = obj;
        tL_inputPhoneContact.last_name = obj2;
        tL_inputPhoneContact.phone = str2;
        if (!TextUtils.isEmpty(str)) {
            tL_inputPhoneContact.flags |= 1;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = str;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.a).bindRequestToGuid(ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_importContacts, new m65(this, tL_inputPhoneContact, tL_contacts_importContacts, (byte) 23), 2), this.G1);
        if (this.L1.a.q) {
            Context context = getContext();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
            newInsert.withValue("account_type", null);
            newInsert.withValue("account_name", null);
            arrayList.add(newInsert.build());
            Uri uri = ContactsContract.Data.CONTENT_URI;
            ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
            if (!TextUtils.isEmpty(obj)) {
                withValue = withValue.withValue("data2", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                withValue = withValue.withValue("data2", obj2);
            }
            arrayList.add(withValue.build());
            if (!str2.isEmpty()) {
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str2).withValue("data2", 2).build());
            }
            try {
                context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            } catch (OperationApplicationException | RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public final void G0(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        fx0 fx0Var = this.P1;
        if (isEmpty) {
            ViewPropertyAnimator animate = fx0Var.animate();
            k43 k43Var = k43.f;
            animate.setInterpolator(k43Var).translationY(hl.L(30.0f)).setDuration(150L);
            this.T1.animate().setInterpolator(k43Var).translationX(-hl.L(30.0f)).setDuration(150L);
            this.H1.animate().setInterpolator(k43Var).translationX(-hl.L(30.0f)).setDuration(150L);
            return;
        }
        fx0Var.animate().setInterpolator(hl.H).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.T1.animate();
        k43 k43Var2 = k43.f;
        animate2.setInterpolator(k43Var2).translationX(0.0f).setDuration(150L);
        this.H1.animate().setInterpolator(k43Var2).translationX(0.0f).setDuration(150L);
        this.P1.setText(charSequence);
    }

    public final void H0(java.lang.String r13, defpackage.gy2 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl7.H0(java.lang.String, gy2):void");
    }

    public final void I0(String str, boolean z) {
        String country;
        this.B1 = str;
        this.C1 = z;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User f = yac.h(this.a).f();
            if (this.B1.startsWith("+")) {
                this.H1.setText(this.B1.substring(1));
            } else if (!this.C1 && f != null && !TextUtils.isEmpty(f.phone)) {
                String str2 = f.phone;
                int i = 4;
                while (true) {
                    if (i >= 1) {
                        List list = (List) this.v1.get(str2.substring(0, i));
                        if (list != null && list.size() > 0) {
                            String str3 = ((gy2) list.get(0)).c;
                            this.H1.setText(str3);
                            if (str3.endsWith("0") && this.B1.startsWith("0")) {
                                this.B1 = this.B1.substring(1);
                            }
                        } else {
                            i--;
                        }
                    } else {
                        Context context = a.b;
                        if (context != null) {
                            country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.H1.setText(country);
                        if (country.endsWith("0") && this.B1.startsWith("0")) {
                            this.B1 = this.B1.substring(1);
                        }
                    }
                }
                this.J1.setText(this.B1);
            } else {
                this.H1.setText(this.B1);
            }
            this.B1 = null;
        }
    }

    public final void J0(boolean z) {
        float f;
        ViewPropertyAnimator animate = this.N1.animate();
        float f2 = 0.0f;
        if (z) {
            f = -hl.L(21.33f);
        } else {
            f = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f);
        k43 k43Var = k43.h;
        ik8.t(translationY, k43Var, 420L);
        ViewPropertyAnimator animate2 = this.o1.animate();
        if (z) {
            f2 = -hl.L(10.665f);
        }
        animate2.translationY(f2).setInterpolator(k43Var).setDuration(420L).start();
    }

    public final void K0(boolean z) {
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        boolean z2 = this.L1.a.q;
        final boolean z3 = !z2;
        float f5 = 0.0f;
        int i3 = 0;
        c51 c51Var = this.q1;
        if (z) {
            c51Var.setVisibility(0);
            ViewPropertyAnimator animate = this.q1.animate();
            if (!z2) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f3);
            k43 k43Var = k43.h;
            alpha.setInterpolator(k43Var).setDuration(420L).withEndAction(new Runnable(this) {
                public final sl7 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z4 = z3;
                    sl7 sl7Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z4) {
                                sl7Var.q1.setVisibility(4);
                                return;
                            }
                            return;
                        case 1:
                            if (!z4) {
                                sl7Var.p1.setVisibility(4);
                                return;
                            }
                            return;
                        default:
                            if (z4) {
                                sl7Var.r1.setVisibility(4);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            this.p1.setVisibility(0);
            ViewPropertyAnimator animate2 = this.p1.animate();
            if (!z2) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            animate2.alpha(f4).setInterpolator(k43Var).setDuration(420L).withEndAction(new Runnable(this) {
                public final sl7 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z4 = z3;
                    sl7 sl7Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z4) {
                                sl7Var.q1.setVisibility(4);
                                return;
                            }
                            return;
                        case 1:
                            if (!z4) {
                                sl7Var.p1.setVisibility(4);
                                return;
                            }
                            return;
                        default:
                            if (z4) {
                                sl7Var.r1.setVisibility(4);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            this.r1.setVisibility(0);
            ViewPropertyAnimator animate3 = this.r1.animate();
            if (z2) {
                f5 = 1.0f;
            }
            animate3.alpha(f5).setInterpolator(k43Var).setDuration(420L).withEndAction(new Runnable(this) {
                public final sl7 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z4 = z3;
                    sl7 sl7Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z4) {
                                sl7Var.q1.setVisibility(4);
                                return;
                            }
                            return;
                        case 1:
                            if (!z4) {
                                sl7Var.p1.setVisibility(4);
                                return;
                            }
                            return;
                        default:
                            if (z4) {
                                sl7Var.r1.setVisibility(4);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        c51Var.animate().cancel();
        if (!z2) {
            i = 0;
        } else {
            i = 4;
        }
        this.q1.setVisibility(i);
        if (!z2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.q1.setAlpha(f);
        this.p1.animate().cancel();
        if (!z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.p1.setVisibility(i2);
        if (!z2) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        this.p1.setAlpha(f2);
        this.r1.animate().cancel();
        if (!z2) {
            i3 = 4;
        }
        this.r1.setVisibility(i3);
        if (z2) {
            f5 = 1.0f;
        }
        this.r1.setAlpha(f5);
    }

    public final void L0(String str) {
        if (this.V1 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.V1, true);
            this.V1 = -1;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        p66 p66Var = this.t1;
        ImageView imageView = this.K1;
        if (isEmpty) {
            ik8.t(imageView.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), k43.h, 420L);
            p66Var.setText("");
            J0(true);
            return;
        }
        ik8.t(imageView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), k43.h, 420L);
        imageView.setImageDrawable(new di2(hl.L(30.0f), hl.L(3.0f), aob.v0(aob.m5, this.J0)));
        p66Var.setText("");
        J0(true);
        v35 v35Var = new v35(this, str, (byte) 10);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) lv2.r(this.a).l0.get(f78.h(str, false));
        if (tL_contact != null) {
            TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(tL_contact.user_id));
            if (X1 != null) {
                v35Var.a(X1);
                return;
            } else {
                kf7.a0(this.a).a.c(new gd7(this, tL_contact, v35Var, (byte) 8));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = f78.h(str, false);
        this.V1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_resolvePhone, new pl7(this, v35Var, (byte) 0));
    }

    public final void M0() {
        String replaceAll = (this.H1.getText().toString() + this.J1.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) this.v1.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) this.w1.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            if (z) {
                break;
            }
        }
        String str = this.U1;
        if (!z) {
            if (!TextUtils.isEmpty(str)) {
                this.U1 = null;
                L0(null);
            }
        } else if (!TextUtils.equals(str, replaceAll)) {
            this.U1 = replaceAll;
            L0(replaceAll);
        }
    }

    @Override
    public final ArrayList S() {
        ArrayList arrayList = new ArrayList();
        int i = aob.G6;
        arrayList.add(new apb(this.m1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        int i2 = aob.k6;
        arrayList.add(new apb(this.H1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        int i3 = aob.l6;
        arrayList.add(new apb(this.H1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.J1, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.H6));
        arrayList.add(new apb(this.J1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.J1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        return arrayList;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        hl.d3(new ll7(this, (byte) 0), 50L);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.z1) {
            this.z1 = false;
            return;
        }
        this.x1 = true;
        this.H1.setText(((gy2) this.u1.get(i)).c);
        this.x1 = false;
    }

    @Override
    public final void p0() {
        int themedColor;
        super.p0();
        try {
            RadialProgressView radialProgressView = this.R1;
            e eVar = this.F1;
            if (radialProgressView != null && eVar != null) {
                radialProgressView.setProgressColor(eVar.getThemedColor(aob.Ji));
            }
            FrameLayout frameLayout = this.S1;
            if (frameLayout != null && eVar != null && ((themedColor = eVar.getThemedColor(aob.Fi)) != this.W1 || this.X1 != aob.I.o())) {
                this.X1 = aob.I.o();
                this.W1 = themedColor;
                aob.F1(frameLayout.getBackground(), themedColor, false);
                aob.F1(frameLayout.getBackground(), rnb.b(themedColor), true);
                frameLayout.invalidate();
            }
            ImageView imageView = this.K1;
            if (imageView != null && (imageView.getDrawable() instanceof di2)) {
                ((di2) imageView.getDrawable()).b(aob.v0(aob.m5, this.J0));
                imageView.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.m1.getEditText().requestFocus();
        this.m1.getEditText().setSelection(this.m1.getEditText().length());
        hl.d3(new ll7(this, (byte) 1), 50L);
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
