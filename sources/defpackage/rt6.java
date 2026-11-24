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
public final class rt6 extends dp {
    public static final int k0 = 0;
    public final Context E;
    public boolean F;
    public boolean G;
    public long H;
    public final c1 I;
    public RecyclerView J;
    public pt6 K;
    public qt6 L;
    public HashMap M;
    public eu6 N;
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
    public wk4 a0;
    public final ts6 b0;
    public MediaDescriptionCompat c0;
    public it6 d0;
    public Bitmap e0;
    public final gu6 f;
    public Uri f0;
    public boolean g0;
    public final gs6 h;
    public Bitmap h0;
    public int i0;
    public final boolean j0;
    public yt6 n;
    public eu6 r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final ArrayList y;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    public rt6(android.content.Context r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt6.<init>(android.content.Context):void");
    }

    public final void e(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            eu6 eu6Var = (eu6) list.get(size);
            if (eu6Var.d() || !eu6Var.g || !eu6Var.h(this.n) || this.r == eu6Var) {
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
        it6 it6Var = this.d0;
        if (it6Var == null) {
            bitmap2 = this.e0;
            uri2 = this.f0;
        } else {
            Bitmap bitmap3 = it6Var.a;
            uri2 = it6Var.b;
            bitmap2 = bitmap3;
        }
        if (bitmap2 == bitmap && (bitmap2 != null || Objects.equals(uri2, uri))) {
            return;
        }
        it6 it6Var2 = this.d0;
        if (it6Var2 != null) {
            it6Var2.cancel(true);
        }
        it6 it6Var3 = new it6(this);
        this.d0 = it6Var3;
        it6Var3.execute(new Void[0]);
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        wk4 wk4Var = this.a0;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        ts6 ts6Var = this.b0;
        if (wk4Var != null) {
            wk4Var.h0(ts6Var);
            this.a0 = null;
        }
        if (mediaSessionCompat$Token == null || !this.G) {
            return;
        }
        wk4 wk4Var2 = new wk4(this.E, mediaSessionCompat$Token);
        this.a0 = wk4Var2;
        wk4Var2.e0(ts6Var);
        MediaMetadata metadata = ((a) this.a0.b).a.getMetadata();
        if (metadata != null) {
            ps psVar = MediaMetadataCompat.d;
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

    public final void i(yt6 yt6Var) {
        if (yt6Var != null) {
            if (!this.n.equals(yt6Var)) {
                this.n = yt6Var;
                if (this.G) {
                    gu6 gu6Var = this.f;
                    gs6 gs6Var = this.h;
                    gu6Var.h(gs6Var);
                    gu6Var.a(yt6Var, gs6Var, 1);
                    l();
                    return;
                }
                return;
            }
            return;
        }
        w26.j("selector must not be null");
    }

    public final void j() {
        int a;
        Context context = this.E;
        int i = -1;
        if (!context.getResources().getBoolean(2131034115)) {
            a = -1;
        } else {
            a = roe.a(context);
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
        du6 du6Var = this.r.a;
        gu6.b();
        for (eu6 eu6Var : DesugarCollections.unmodifiableList(du6Var.b)) {
            pj4 b = this.r.b(eu6Var);
            if (b != null) {
                tt6 tt6Var = (tt6) b.b;
                if (tt6Var != null && tt6Var.d) {
                    arrayList2.add(eu6Var);
                }
                if (tt6Var != null && tt6Var.e) {
                    arrayList3.add(eu6Var);
                }
            }
        }
        e(arrayList2);
        e(arrayList3);
        is6 is6Var = is6.d;
        Collections.sort(arrayList, is6Var);
        Collections.sort(arrayList2, is6Var);
        Collections.sort(arrayList3, is6Var);
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
            c1 c1Var = this.I;
            c1Var.removeMessages(1);
            c1Var.sendEmptyMessageAtTime(1, this.H + 300);
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
        h(gu6.e());
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(2131492922);
        View decorView = getWindow().getDecorView();
        Context context = this.E;
        if (voe.h(context)) {
            i = 2131099761;
        } else {
            i = 2131099760;
        }
        decorView.setBackgroundColor(context.getColor(i));
        ImageButton imageButton = (ImageButton) findViewById(2131296520);
        this.S = imageButton;
        imageButton.setColorFilter(-1);
        this.S.setOnClickListener(new ht6(this, (byte) 0));
        Button button = (Button) findViewById(2131296536);
        this.T = button;
        button.setTextColor(-1);
        this.T.setOnClickListener(new ht6(this, (byte) 1));
        this.K = new pt6(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131296526);
        this.J = recyclerView;
        recyclerView.setAdapter(this.K);
        this.J.setLayoutManager(new t26());
        this.L = new qt6(this);
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
