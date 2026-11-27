package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class wv6 extends ep {
    public static final int k0 = 0;
    public final Context E;
    public boolean F;
    public boolean G;
    public long H;
    public final d1 I;
    public RecyclerView J;
    public uv6 K;
    public vv6 L;
    public HashMap M;
    public jw6 N;
    public HashMap O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public ImageButton S;
    public Button T;
    public ImageView U;
    public View V;
    public ImageView W;
    public TextView X;
    public TextView Y;
    public String Z;
    public um4 a0;
    public final yu6 b0;
    public MediaDescriptionCompat c0;
    public nv6 d0;
    public Bitmap e0;
    public final lw6 f;
    public Uri f0;
    public boolean g0;
    public final lu6 h;
    public Bitmap h0;
    public int i0;
    public final boolean j0;
    public dw6 n;
    public jw6 r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final ArrayList y;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    public wv6(android.content.Context r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv6.<init>(android.content.Context):void");
    }

    public final void e(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            jw6 jw6Var = (jw6) list.get(size);
            if (jw6Var.d() || !jw6Var.g || !jw6Var.h(this.n) || this.r == jw6Var) {
                list.remove(size);
            }
        }
    }

    public final void f() {
        Bitmap bitmap;
        Uri uri;
        Uri uri2;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.c0;
        if (mediaDescriptionCompat == null) {
            uri = null;
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.e;
            uri = mediaDescriptionCompat.f;
        }
        nv6 nv6Var = this.d0;
        if (nv6Var == null) {
            bitmap2 = this.e0;
            uri2 = this.f0;
        } else {
            Bitmap bitmap3 = nv6Var.a;
            uri2 = nv6Var.b;
            bitmap2 = bitmap3;
        }
        if (bitmap2 == bitmap && (bitmap2 != null || Objects.equals(uri2, uri))) {
            return;
        }
        nv6 nv6Var2 = this.d0;
        if (nv6Var2 != null) {
            nv6Var2.cancel(true);
        }
        nv6 nv6Var3 = new nv6(this);
        this.d0 = nv6Var3;
        nv6Var3.execute(new Void[0]);
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        um4 um4Var = this.a0;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        yu6 yu6Var = this.b0;
        if (um4Var != null) {
            um4Var.e0(yu6Var);
            this.a0 = null;
        }
        if (mediaSessionCompat$Token == null || !this.G) {
            return;
        }
        um4 um4Var2 = new um4(this.E, mediaSessionCompat$Token);
        this.a0 = um4Var2;
        um4Var2.b0(yu6Var);
        MediaMetadata metadata = ((a) this.a0.b).a.getMetadata();
        if (metadata != null) {
            qs qsVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            mediaMetadataCompat.b = metadata;
        } else {
            mediaMetadataCompat = null;
        }
        if (mediaMetadataCompat != null) {
            mediaDescriptionCompat = mediaMetadataCompat.a();
        }
        this.c0 = mediaDescriptionCompat;
        f();
        k();
    }

    public final void i(dw6 dw6Var) {
        if (dw6Var != null) {
            if (!this.n.equals(dw6Var)) {
                this.n = dw6Var;
                if (this.G) {
                    lw6 lw6Var = this.f;
                    lu6 lu6Var = this.h;
                    lw6Var.h(lu6Var);
                    lw6Var.a(dw6Var, lu6Var, 1);
                    l();
                    return;
                }
                return;
            }
            return;
        }
        lq5.j("selector must not be null");
    }

    public final void j() {
        int a;
        Context context = this.E;
        int i = -1;
        if (!context.getResources().getBoolean(2131034115)) {
            a = -1;
        } else {
            a = mte.a(context);
        }
        if (context.getResources().getBoolean(2131034115)) {
            i = -2;
        }
        getWindow().setLayout(a, i);
        this.e0 = null;
        this.f0 = null;
        f();
        k();
        n();
    }

    public final void k() {
        boolean z;
        CharSequence charSequence;
        Bitmap bitmap;
        if (this.N == null && !this.P) {
            z = !this.F;
        } else {
            z = true;
        }
        if (z) {
            this.R = true;
            return;
        }
        this.R = false;
        if (!this.r.g() || this.r.d()) {
            dismiss();
        }
        CharSequence charSequence2 = null;
        if (this.g0 && (((bitmap = this.h0) == null || !bitmap.isRecycled()) && this.h0 != null)) {
            this.W.setVisibility(0);
            this.W.setImageBitmap(this.h0);
            this.W.setBackgroundColor(this.i0);
            this.V.setVisibility(0);
            Bitmap bitmap2 = this.h0;
            RenderScript create = RenderScript.create(this.E);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap2);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            Bitmap copy = bitmap2.copy(bitmap2.getConfig(), true);
            createTyped.copyTo(copy);
            createFromBitmap.destroy();
            createTyped.destroy();
            create2.destroy();
            create.destroy();
            this.U.setImageBitmap(copy);
        } else {
            Bitmap bitmap3 = this.h0;
            if (bitmap3 != null && bitmap3.isRecycled()) {
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.h0);
            }
            this.W.setVisibility(8);
            this.V.setVisibility(8);
            this.U.setImageBitmap(null);
        }
        this.g0 = false;
        this.h0 = null;
        this.i0 = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.c0;
        if (mediaDescriptionCompat == null) {
            charSequence = null;
        } else {
            charSequence = mediaDescriptionCompat.b;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.c0;
        if (mediaDescriptionCompat2 != null) {
            charSequence2 = mediaDescriptionCompat2.c;
        }
        boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
        TextView textView = this.X;
        if (!isEmpty) {
            textView.setText(charSequence);
        } else {
            textView.setText(this.Z);
        }
        TextView textView2 = this.Y;
        if (!isEmpty2) {
            textView2.setText(charSequence2);
            this.Y.setVisibility(0);
            return;
        }
        textView2.setVisibility(8);
    }

    public final void l() {
        ArrayList arrayList = this.s;
        arrayList.clear();
        ArrayList arrayList2 = this.w;
        arrayList2.clear();
        ArrayList arrayList3 = this.x;
        arrayList3.clear();
        arrayList.addAll(DesugarCollections.unmodifiableList(this.r.v));
        iw6 iw6Var = this.r.a;
        lw6.b();
        for (jw6 jw6Var : DesugarCollections.unmodifiableList(iw6Var.b)) {
            v34 b = this.r.b(jw6Var);
            if (b != null) {
                yv6 yv6Var = (yv6) b.b;
                if (yv6Var != null && yv6Var.d) {
                    arrayList2.add(jw6Var);
                }
                if (yv6Var != null && yv6Var.e) {
                    arrayList3.add(jw6Var);
                }
            }
        }
        e(arrayList2);
        e(arrayList3);
        nu6 nu6Var = nu6.d;
        Collections.sort(arrayList, nu6Var);
        Collections.sort(arrayList2, nu6Var);
        Collections.sort(arrayList3, nu6Var);
        this.K.G();
    }

    public final void n() {
        boolean z;
        if (this.G) {
            if (SystemClock.uptimeMillis() - this.H >= 300) {
                if (this.N == null && !this.P) {
                    z = !this.F;
                } else {
                    z = true;
                }
                if (z) {
                    this.Q = true;
                    return;
                }
                this.Q = false;
                if (!this.r.g() || this.r.d()) {
                    dismiss();
                }
                this.H = SystemClock.uptimeMillis();
                this.K.F();
                return;
            }
            d1 d1Var = this.I;
            d1Var.removeMessages(1);
            d1Var.sendEmptyMessageAtTime(1, this.H + 300);
        }
    }

    public final void o() {
        if (this.Q) {
            n();
        }
        if (this.R) {
            k();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        this.f.a(this.n, this.h, 1);
        l();
        h(lw6.e());
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(2131492922);
        View decorView = getWindow().getDecorView();
        Context context = this.E;
        if (nte.h(context)) {
            i = 2131099761;
        } else {
            i = 2131099760;
        }
        decorView.setBackgroundColor(context.getColor(i));
        ImageButton imageButton = (ImageButton) findViewById(2131296520);
        this.S = imageButton;
        imageButton.setColorFilter(-1);
        this.S.setOnClickListener(new mv6(this, (byte) 0));
        Button button = (Button) findViewById(2131296536);
        this.T = button;
        button.setTextColor(-1);
        this.T.setOnClickListener(new mv6(this, (byte) 1));
        this.K = new uv6(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131296526);
        this.J = recyclerView;
        recyclerView.setAdapter(this.K);
        this.J.setLayoutManager(new x46());
        this.L = new vv6(this);
        this.M = new HashMap();
        this.O = new HashMap();
        this.U = (ImageView) findViewById(2131296528);
        this.V = findViewById(2131296529);
        this.W = (ImageView) findViewById(2131296527);
        TextView textView = (TextView) findViewById(2131296531);
        this.X = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(2131296530);
        this.Y = textView2;
        textView2.setTextColor(-1);
        this.Z = context.getResources().getString(2131689638);
        this.F = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        this.f.h(this.h);
        this.I.removeCallbacksAndMessages(null);
        h(null);
    }
}
