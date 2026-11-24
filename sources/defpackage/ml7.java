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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
public final class ml7 extends my0 implements AdapterView.OnItemSelectedListener {
    public boolean A1;
    public String B1;
    public boolean C1;
    public String D1;
    public String E1;
    public final d F1;
    public final int G1;
    public final ll7 H1;
    public final View I1;
    public final ll7 J1;
    public final ImageView K1;
    public final jh2 L1;
    public final TextView M1;
    public final LinearLayout N1;
    public int O1;
    public final ey0 P1;
    public final TextView Q1;
    public final RadialProgressView R1;
    public final FrameLayout S1;
    public final TextView T1;
    public String U1;
    public int V1;
    public int W1;
    public boolean X1;
    public final LinearLayout l1;
    public final ft7 m1;
    public final ft7 n1;
    public final FrameLayout o1;
    public final View p1;
    public final b61 q1;
    public final ft7 r1;
    public final gt7 s1;
    public final l66 t1;
    public final ArrayList u1;
    public final HashMap v1;
    public final HashMap w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;

    public ml7(org.telegram.ui.ActionBar.d r25, android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml7.<init>(org.telegram.ui.ActionBar.d, android.content.Context):void");
    }

    public static String E0(LaunchActivity launchActivity, TLRPC.User user, String str) {
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
            fc4.g(e, true);
        }
        if (!str.startsWith("+")) {
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                String str2 = user.phone;
                for (int i = 4; i >= 1; i--) {
                    String substring = str2.substring(0, i);
                    if (((String) hashMap.get(substring)) != null) {
                        return kt6.o("+", substring, str);
                    }
                }
            } else {
                return "+".concat(str);
            }
        }
        return str;
    }

    public final void D0() {
        String str;
        this.A1 = true;
        gm.T3(this.Q1, false, 0.5f, true, true);
        gm.T3(this.R1, true, 0.5f, true, true);
        String str2 = "+" + this.H1.getText().toString() + this.J1.getText().toString();
        String obj = this.m1.getEditText().getText().toString();
        String obj2 = this.n1.getEditText().getText().toString();
        ft7 ft7Var = this.r1;
        if (ft7Var.getVisibility() == 0) {
            str = ft7Var.getEditText().getText().toString();
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
        ConnectionsManager.getInstance(this.a).bindRequestToGuid(ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_importContacts, new i65(this, tL_inputPhoneContact, tL_contacts_importContacts, (byte) 23), 2), this.G1);
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

    public final void F0(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ey0 ey0Var = this.P1;
        if (isEmpty) {
            ViewPropertyAnimator animate = ey0Var.animate();
            d53 d53Var = d53.f;
            animate.setInterpolator(d53Var).translationY(gm.L(30.0f)).setDuration(150L);
            this.T1.animate().setInterpolator(d53Var).translationX(-gm.L(30.0f)).setDuration(150L);
            this.H1.animate().setInterpolator(d53Var).translationX(-gm.L(30.0f)).setDuration(150L);
            return;
        }
        ey0Var.animate().setInterpolator(gm.H).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.T1.animate();
        d53 d53Var2 = d53.f;
        animate2.setInterpolator(d53Var2).translationX(0.0f).setDuration(150L);
        this.H1.animate().setInterpolator(d53Var2).translationX(0.0f).setDuration(150L);
        this.P1.setText(charSequence);
    }

    public final void G0(java.lang.String r13, defpackage.wy2 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml7.G0(java.lang.String, wy2):void");
    }

    public final void H0(String str, boolean z) {
        String country;
        this.B1 = str;
        this.C1 = z;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User f = z8c.h(this.a).f();
            if (this.B1.startsWith("+")) {
                this.H1.setText(this.B1.substring(1));
            } else if (!this.C1 && f != null && !TextUtils.isEmpty(f.phone)) {
                String str2 = f.phone;
                int i = 4;
                while (true) {
                    if (i >= 1) {
                        List list = (List) this.v1.get(str2.substring(0, i));
                        if (list != null && list.size() > 0) {
                            String str3 = ((wy2) list.get(0)).c;
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

    public final void I0(boolean z) {
        float f;
        ViewPropertyAnimator animate = this.N1.animate();
        float f2 = 0.0f;
        if (z) {
            f = -gm.L(21.33f);
        } else {
            f = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f);
        d53 d53Var = d53.h;
        wi8.t(translationY, d53Var, 420L);
        ViewPropertyAnimator animate2 = this.o1.animate();
        if (z) {
            f2 = -gm.L(10.665f);
        }
        animate2.translationY(f2).setInterpolator(d53Var).setDuration(420L).start();
    }

    public final void J0(boolean z) {
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
        b61 b61Var = this.q1;
        if (z) {
            b61Var.setVisibility(0);
            ViewPropertyAnimator animate = this.q1.animate();
            if (!z2) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f3);
            d53 d53Var = d53.h;
            alpha.setInterpolator(d53Var).setDuration(420L).withEndAction(new Runnable(this) {
                public final ml7 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z4 = z3;
                    ml7 ml7Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z4) {
                                ml7Var.q1.setVisibility(4);
                                return;
                            }
                            return;
                        case 1:
                            if (!z4) {
                                ml7Var.p1.setVisibility(4);
                                return;
                            }
                            return;
                        default:
                            if (z4) {
                                ml7Var.r1.setVisibility(4);
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
            animate2.alpha(f4).setInterpolator(d53Var).setDuration(420L).withEndAction(new Runnable(this) {
                public final ml7 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z4 = z3;
                    ml7 ml7Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z4) {
                                ml7Var.q1.setVisibility(4);
                                return;
                            }
                            return;
                        case 1:
                            if (!z4) {
                                ml7Var.p1.setVisibility(4);
                                return;
                            }
                            return;
                        default:
                            if (z4) {
                                ml7Var.r1.setVisibility(4);
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
            animate3.alpha(f5).setInterpolator(d53Var).setDuration(420L).withEndAction(new Runnable(this) {
                public final ml7 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z4 = z3;
                    ml7 ml7Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z4) {
                                ml7Var.q1.setVisibility(4);
                                return;
                            }
                            return;
                        case 1:
                            if (!z4) {
                                ml7Var.p1.setVisibility(4);
                                return;
                            }
                            return;
                        default:
                            if (z4) {
                                ml7Var.r1.setVisibility(4);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        b61Var.animate().cancel();
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

    public final void K0(String str) {
        if (this.V1 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.V1, true);
            this.V1 = -1;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        l66 l66Var = this.t1;
        ImageView imageView = this.K1;
        if (isEmpty) {
            wi8.t(imageView.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), d53.h, 420L);
            l66Var.setText("");
            I0(true);
            return;
        }
        wi8.t(imageView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), d53.h, 420L);
        imageView.setImageDrawable(new wi2(gm.L(30.0f), gm.L(3.0f), cmb.v0(cmb.l5, this.J0)));
        l66Var.setText("");
        I0(true);
        u35 u35Var = new u35(this, str, (byte) 10);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) bw2.r(this.a).l0.get(r58.h(str, false));
        if (tL_contact != null) {
            TLRPC.User W1 = oc7.r1(this.a).W1(Long.valueOf(tL_contact.user_id));
            if (W1 != null) {
                u35Var.a(W1);
                return;
            } else {
                cf7.Y(this.a).a.c(new ud7(this, tL_contact, u35Var, (byte) 5));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = r58.h(str, false);
        this.V1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_resolvePhone, new jl7(this, u35Var, (byte) 0));
    }

    public final void L0() {
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
                K0(null);
            }
        } else if (!TextUtils.equals(str, replaceAll)) {
            this.U1 = replaceAll;
            K0(replaceAll);
        }
    }

    @Override
    public final ArrayList R() {
        ArrayList arrayList = new ArrayList();
        int i = cmb.F6;
        arrayList.add(new cnb(this.m1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.j6;
        arrayList.add(new cnb(this.H1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        int i3 = cmb.k6;
        arrayList.add(new cnb(this.H1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.J1, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.G6));
        arrayList.add(new cnb(this.J1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.J1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        return arrayList;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        gm.d3(new fl7(this, (byte) 0), 50L);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.z1) {
            this.z1 = false;
            return;
        }
        this.x1 = true;
        this.H1.setText(((wy2) this.u1.get(i)).c);
        this.x1 = false;
    }

    @Override
    public final void p0() {
        int themedColor;
        super.p0();
        try {
            RadialProgressView radialProgressView = this.R1;
            d dVar = this.F1;
            if (radialProgressView != null && dVar != null) {
                radialProgressView.setProgressColor(dVar.getThemedColor(cmb.Ii));
            }
            FrameLayout frameLayout = this.S1;
            if (frameLayout != null && dVar != null && ((themedColor = dVar.getThemedColor(cmb.Ei)) != this.W1 || this.X1 != cmb.I.o())) {
                this.X1 = cmb.I.o();
                this.W1 = themedColor;
                cmb.F1(frameLayout.getBackground(), themedColor, false);
                cmb.F1(frameLayout.getBackground(), ulb.b(themedColor), true);
                frameLayout.invalidate();
            }
            ImageView imageView = this.K1;
            if (imageView != null && (imageView.getDrawable() instanceof wi2)) {
                ((wi2) imageView.getDrawable()).b(cmb.v0(cmb.l5, this.J0));
                imageView.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.m1.getEditText().requestFocus();
        this.m1.getEditText().setSelection(this.m1.getEditText().length());
        gm.d3(new fl7(this, (byte) 1), 50L);
    }

    @Override
    public final void z(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.D7));
        hashSet.add(Integer.valueOf(cmb.C7));
        hashSet.add(Integer.valueOf(cmb.k6));
        hashSet.add(Integer.valueOf(cmb.G6));
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
