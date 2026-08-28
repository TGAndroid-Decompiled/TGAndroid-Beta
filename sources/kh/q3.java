package kh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.wk0;
public abstract class q3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry f15857f0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable A;
    public final f3 B;
    public final org.telegram.ui.ActionBar.w0 C;
    public final ImageView D;
    public final LinearLayout E;
    public final d F;
    public boolean G;
    public final boolean H;
    public final boolean I;
    public int J;
    public final float K;
    public final boolean L;
    public boolean M;
    public int N;
    public final org.telegram.ui.Components.y5 O;
    public boolean P;
    public boolean Q;
    public Runnable R;
    public Utilities.Callback2 S;
    public Utilities.Callback3 T;
    public final ArrayList U;
    public boolean V;
    public boolean W;
    public final int f15858a;
    public MediaController.AlbumEntry f15859a0;
    public final org.telegram.ui.ActionBar.b6 f15860b;
    public ArrayList f15861b0;
    public final Paint f15862c;
    public ArrayList f15863c0;
    public final z2 d;
    public final ArrayList f15864d0;
    public final a3 f15865e;
    public dh.g f15866e0;
    public final j3 f15867f;
    public final FrameLayout h;
    public final wk0 f15868n;
    public final g3 f15869r;
    public final gw0 f15870s;
    public final b4 v;
    public boolean f15871w;
    public final org.telegram.ui.ActionBar.k f15872x;
    public final TextView f15873y;

    public q3(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f10, boolean z11, boolean z12) {
        super(context);
        Paint paint = new Paint(1);
        this.f15862c = paint;
        this.J = -2;
        this.O = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
        this.Q = true;
        ArrayList arrayList = new ArrayList();
        this.U = arrayList;
        this.f15864d0 = new ArrayList();
        this.K = f10;
        this.f15858a = i9;
        this.f15860b = b6Var;
        this.H = z10;
        this.I = z11;
        this.L = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        z2 z2Var = new z2(this, context, b6Var);
        this.d = z2Var;
        z2Var.setItemSelectorColorProvider(new i3.i(15));
        j3 j3Var = new j3(this);
        this.f15867f = j3Var;
        z2Var.setAdapter(j3Var);
        a3 a3Var = new a3(this);
        this.f15865e = a3Var;
        z2Var.setLayoutManager(a3Var);
        z2Var.setFastScrollEnabled(1);
        z2Var.setFastScrollVisible(true);
        z2Var.getFastScroll().setAlpha(0.0f);
        a3Var.O = new b3(this);
        z2Var.i(new Object());
        z2Var.setClipToPadding(false);
        addView(z2Var, g7.e6.e(-1, -1, 119));
        z2Var.setOnItemClickListener(new mk0(this) {
            public final q3 f16083b;

            {
                this.f16083b = this;
            }

            @Override
            public final void a(int i10, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        q3 q3Var = this.f16083b;
                        ArrayList arrayList2 = q3Var.U;
                        ArrayList arrayList3 = q3Var.f15864d0;
                        if (i10 >= 2 && q3Var.S != null && (view instanceof m3)) {
                            m3 m3Var = (m3) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (q3Var.V) {
                                if (i11 == 0) {
                                    q3Var.e(q3.f15857f0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (q3Var.W) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    a8 a8Var = (a8) arrayList2.get(i11);
                                    Utilities.Callback2 callback22 = q3Var.S;
                                    if (a8Var.K) {
                                        bitmap = q3.d(m3Var);
                                    }
                                    callback22.run(a8Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < q3Var.f15861b0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.f15861b0.get(i11);
                                if (arrayList3.isEmpty() && !q3Var.M) {
                                    Utilities.Callback2 callback23 = q3Var.S;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = q3.d(m3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > q3Var.N) {
                                    int i12 = -q3Var.J;
                                    q3Var.J = i12;
                                    AndroidUtilities.shakeViewSpring(m3Var, i12);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(q3Var.d);
                                q3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        q3 q3Var2 = this.f16083b;
                        g3 g3Var = q3Var2.f15869r;
                        org.telegram.ui.ActionBar.w0 w0Var = q3Var2.C;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < g3Var.f15826c.size() && (callback2 = q3Var2.S) != null) {
                            callback2.run(g3Var.f15826c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        z2Var.setOnItemLongClickListener(new p(this, 2));
        z2Var.setOnScrollListener(new d3(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b6Var);
        this.f15872x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.A(436207615, false);
        kVar.C(-1, false);
        kVar.C(-1, true);
        addView(kVar, g7.e6.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new e3(this));
        org.telegram.ui.ActionBar.z n10 = kVar.n();
        f3 f3Var = new f3(this, context, n10, b6Var);
        this.B = f3Var;
        f3Var.setSubMenuOpenSide(1);
        kVar.addView(f3Var, 0, g7.e6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        f3Var.setOnClickListener(new View.OnClickListener(this) {
            public final q3 f16137b;

            {
                this.f16137b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f16137b.B.M(null, null);
                        return;
                    case 1:
                        q3 q3Var = this.f16137b;
                        if (q3Var.E.getAlpha() >= 0.25f) {
                            q3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        q3 q3Var2 = this.f16137b;
                        if (q3Var2.E.getAlpha() >= 0.25f) {
                            q3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f16137b.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f15873y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.A = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        f3Var.addView(textView, g7.e6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        wk0 wk0Var = new wk0(context, b6Var);
        this.f15868n = wk0Var;
        wk0Var.setLayoutManager(new f2.y(3));
        g3 g3Var = new g3(this);
        this.f15869r = g3Var;
        wk0Var.setAdapter(g3Var);
        wk0Var.setOnScrollListener(new h3(this));
        wk0Var.setClipToPadding(true);
        wk0Var.i(new Object());
        frameLayout.addView(wk0Var, g7.e6.e(-1, -1, 119));
        e00 e00Var = new e00(context, b6Var);
        e00Var.setViewType(2);
        e00Var.setAlpha(0.0f);
        e00Var.setVisibility(8);
        frameLayout.addView(e00Var, g7.e6.e(-1, -1, 119));
        gw0 gw0Var = new gw0(context, e00Var, 11, b6Var);
        this.f15870s = gw0Var;
        dh.u uVar = gw0Var.d;
        uVar.setTextSize(1, 16.0f);
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var));
        uVar.setTypeface(null);
        uVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new b4(this, false, new bg.i(this, 26));
        frameLayout.addView(gw0Var, g7.e6.e(-1, -1, 119));
        wk0Var.setEmptyView(gw0Var);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new y2(this);
        this.C = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        wk0Var.setOnItemClickListener(new mk0(this) {
            public final q3 f16083b;

            {
                this.f16083b = this;
            }

            @Override
            public final void a(int i10, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        q3 q3Var = this.f16083b;
                        ArrayList arrayList2 = q3Var.U;
                        ArrayList arrayList3 = q3Var.f15864d0;
                        if (i10 >= 2 && q3Var.S != null && (view instanceof m3)) {
                            m3 m3Var = (m3) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (q3Var.V) {
                                if (i11 == 0) {
                                    q3Var.e(q3.f15857f0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (q3Var.W) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    a8 a8Var = (a8) arrayList2.get(i11);
                                    Utilities.Callback2 callback22 = q3Var.S;
                                    if (a8Var.K) {
                                        bitmap = q3.d(m3Var);
                                    }
                                    callback22.run(a8Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < q3Var.f15861b0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.f15861b0.get(i11);
                                if (arrayList3.isEmpty() && !q3Var.M) {
                                    Utilities.Callback2 callback23 = q3Var.S;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = q3.d(m3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > q3Var.N) {
                                    int i12 = -q3Var.J;
                                    q3Var.J = i12;
                                    AndroidUtilities.shakeViewSpring(m3Var, i12);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(q3Var.d);
                                q3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        q3 q3Var2 = this.f16083b;
                        g3 g3Var2 = q3Var2.f15869r;
                        org.telegram.ui.ActionBar.w0 w0Var = q3Var2.C;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < g3Var2.f15826c.size() && (callback2 = q3Var2.S) != null) {
                            callback2.run(g3Var2.f15826c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = MessagesController.getInstance(i9).getStoriesController().f12255w.f14977b;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                a8 a8Var = (a8) obj;
                if (!a8Var.f14917g && !a8Var.f14946w) {
                    this.U.add(a8Var);
                }
            }
        }
        if (z11) {
            this.D = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, g7.e6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d i11 = ll.i(24, context, b6Var, true);
            this.F = i11;
            i11.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(i11, g7.e6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                i11.setOnClickListener(new View.OnClickListener(this) {
                    public final q3 f16137b;

                    {
                        this.f16137b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f16137b.B.M(null, null);
                                return;
                            case 1:
                                q3 q3Var = this.f16137b;
                                if (q3Var.E.getAlpha() >= 0.25f) {
                                    q3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                q3 q3Var2 = this.f16137b;
                                if (q3Var2.E.getAlpha() >= 0.25f) {
                                    q3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f16137b.f(false);
                                return;
                        }
                    }
                });
            }
            d i12 = ll.i(24, context, b6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            eq eqVar = new eq(R.drawable.mini_collage, 0);
            eqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            i12.g(spannableStringBuilder, false, true);
            linearLayout.addView(i12, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            i12.setOnClickListener(new View.OnClickListener(this) {
                public final q3 f16137b;

                {
                    this.f16137b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f16137b.B.M(null, null);
                            return;
                        case 1:
                            q3 q3Var = this.f16137b;
                            if (q3Var.E.getAlpha() >= 0.25f) {
                                q3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            q3 q3Var2 = this.f16137b;
                            if (q3Var2.E.getAlpha() >= 0.25f) {
                                q3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f16137b.f(false);
                            return;
                    }
                }
            });
        } else {
            this.E = null;
            this.F = null;
            ImageView imageView = new ImageView(context);
            this.D = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            imageView.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
            g7.g6.b(imageView, 0.1f, 1.5f);
            addView(imageView, g7.e6.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final q3 f16137b;

                {
                    this.f16137b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f16137b.B.M(null, null);
                            return;
                        case 1:
                            q3 q3Var = this.f16137b;
                            if (q3Var.E.getAlpha() >= 0.25f) {
                                q3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            q3 q3Var2 = this.f16137b;
                            if (q3Var2.E.getAlpha() >= 0.25f) {
                                q3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f16137b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = f15857f0;
        if (albumEntry != null && (albumEntry != albumEntry2 || this.U.size() > 0)) {
            this.f15859a0 = albumEntry;
        } else {
            ArrayList arrayList3 = this.f15863c0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f15859a0 = (MediaController.AlbumEntry) this.f15863c0.get(0);
            } else {
                this.f15859a0 = MediaController.allMediaAlbumEntry;
            }
        }
        this.f15861b0 = b(this.f15859a0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.f15859a0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.f15873y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.f15873y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.f15873y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(m3 m3Var) {
        Bitmap bitmap;
        if (m3Var != null && (bitmap = m3Var.f15677a) != null && !bitmap.isRecycled()) {
            return Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
        }
        return null;
    }

    public final ArrayList b(MediaController.AlbumEntry albumEntry) {
        if (albumEntry == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < albumEntry.photos.size(); i9++) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i9);
            if (!this.H || !photoEntry.isVideo) {
                arrayList.add(photoEntry);
            }
        }
        return arrayList;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.albumsDidLoad;
        j3 j3Var = this.f15867f;
        int i12 = 0;
        if (i9 == i11) {
            h();
            if (this.f15859a0 != null) {
                while (true) {
                    if (i12 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f15859a0;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f15859a0 = albumEntry;
                        break;
                    }
                    i12++;
                }
            } else {
                ArrayList arrayList = this.f15863c0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f15859a0 = (MediaController.AlbumEntry) this.f15863c0.get(0);
                } else {
                    this.f15859a0 = MediaController.allMediaAlbumEntry;
                }
            }
            this.f15861b0 = b(this.f15859a0);
            this.f15864d0.clear();
            i();
            if (j3Var != null) {
                j3Var.l();
            }
        } else if (i9 == NotificationCenter.storiesDraftsUpdated) {
            ArrayList arrayList2 = this.U;
            arrayList2.clear();
            if (!this.H) {
                ArrayList arrayList3 = MessagesController.getInstance(this.f15858a).getStoriesController().f12255w.f14977b;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj = arrayList3.get(i12);
                    i12++;
                    a8 a8Var = (a8) obj;
                    if (!a8Var.f14917g && !a8Var.f14946w) {
                        arrayList2.add(a8Var);
                    }
                }
            }
            h();
            i();
            if (j3Var != null) {
                j3Var.l();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float g10 = g();
        int i9 = 0;
        if (g10 <= org.telegram.messenger.l0.b(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.O.e(z10);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e10);
        if (z10 != this.f15871w) {
            this.f15871w = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f15871w) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f15872x;
        if (kVar != null) {
            kVar.setAlpha(e10);
            if (e10 <= 0.0f) {
                i9 = 8;
            }
            if (kVar.getVisibility() != i9) {
                kVar.setVisibility(i9);
            }
        }
        dh.g gVar = this.f15866e0;
        if (gVar != null) {
            gVar.setAlpha(1.0f - e10);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f15862c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z10) {
        this.f15859a0 = albumEntry;
        this.f15861b0 = b(albumEntry);
        this.f15864d0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.f15859a0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.f15873y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == f15857f0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f15867f.l();
        a3 a3Var = this.f15865e;
        if (z10) {
            rh.n nVar = new rh.n(getContext(), 2);
            nVar.f5443a = 1;
            nVar.f47269p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            a3Var.w0(nVar);
            return;
        }
        a3Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        m3 m3Var;
        if (this.T != null) {
            ArrayList arrayList = this.f15864d0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.S.run((MediaController.PhotoEntry) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i9 = 0;
                while (true) {
                    z2 z2Var = this.d;
                    if (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < z2Var.getChildCount()) {
                                    View childAt = z2Var.getChildAt(i10);
                                    if (childAt instanceof m3) {
                                        m3Var = (m3) childAt;
                                        if (m3Var.O == photoEntry) {
                                            break;
                                        }
                                    }
                                    i10++;
                                } else {
                                    m3Var = null;
                                    break;
                                }
                            }
                            bitmap = d(m3Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.T.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        AndroidUtilities.updateVisibleRows(z2Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        z2 z2Var = this.d;
        if (z2Var != null && z2Var.getChildCount() > 0) {
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < z2Var.getChildCount(); i10++) {
                View childAt = z2Var.getChildAt(i10);
                if (RecyclerView.R(childAt) > 0) {
                    i9 = Math.min(i9, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i9, getHeight()));
        } else {
            padding = getPadding();
        }
        if (z2Var == null) {
            return padding;
        }
        return AndroidUtilities.lerp(0, padding, z2Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.f15859a0;
    }

    public String getTitle() {
        int i9;
        if (this.H) {
            i9 = R.string.AddImage;
        } else {
            i9 = R.string.ChoosePhotoOrVideo;
        }
        return LocaleController.getString(i9);
    }

    public final void h() {
        a aVar;
        f3 f3Var = this.B;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f3Var.f23901b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f15863c0 = arrayList2;
        Collections.sort(arrayList2, new bg.l0(arrayList, 3));
        ArrayList arrayList3 = this.U;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = f15857f0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f15863c0;
            arrayList4.add(!arrayList4.isEmpty(), albumEntry);
        }
        boolean isEmpty2 = this.f15863c0.isEmpty();
        TextView textView = this.f15873y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A, (Drawable) null);
        int size = this.f15863c0.size();
        for (int i9 = 0; i9 < size; i9++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.f15863c0.get(i9);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.f15860b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.f15860b);
                }
            }
            f3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bg.u1(25, this, albumEntry2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f15863c0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f15863c0.get(0) == this.f15859a0 && this.U.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V = z10;
        if (z10 || (this.f15859a0 != f15857f0 && ((arrayList = this.f15863c0) == null || arrayList.isEmpty() || this.f15863c0.get(0) != this.f15859a0))) {
            z11 = false;
        }
        this.W = z11;
    }

    public final void j() {
        float f10;
        float f11;
        int dp;
        ArrayList arrayList = this.f15864d0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z10 = !isEmpty;
        float f12 = 0.0f;
        float f13 = 1.0f;
        ImageView imageView = this.D;
        if (imageView != null) {
            ViewPropertyAnimator animate = imageView.animate();
            if (!isEmpty) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            float f14 = 0.7f;
            if (!isEmpty) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!isEmpty) {
                f14 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f14);
            if (!isEmpty) {
                dp = -AndroidUtilities.navigationBarHeight;
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            ll.r(scaleY.translationY(dp), gr.h, 320L);
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout != null) {
            d dVar = this.F;
            if (dVar != null) {
                dVar.g(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f15 = 10.0f;
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(10.0f);
            if (AndroidUtilities.navigationBarHeight > 0) {
                f15 = 0.0f;
            }
            linearLayout.setPadding(dp2, dp3, dp4, AndroidUtilities.dp(f15) + AndroidUtilities.navigationBarHeight);
            if (this.P != z10) {
                this.P = z10;
                linearLayout.setVisibility(0);
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (isEmpty) {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f13);
                if (isEmpty) {
                    f12 = AndroidUtilities.dp(32.0f);
                }
                alpha2.translationY(f12).setInterpolator(gr.h).setDuration(320L).setListener(new hg.b0(10, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f15858a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f15858a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        m3.f15675a0.clear();
        m3.f15676b0.evictAll();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = m3.V;
            if (i9 < arrayList.size()) {
                ((DispatchQueue) arrayList.get(i9)).cleanupQueue();
                ((DispatchQueue) arrayList.get(i9)).recycle();
                i9++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int dp;
        float f10;
        float f11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        z2 z2Var = this.d;
        z2Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int dp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int dp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.E;
        if (linearLayout == null) {
            dp = 0;
        } else {
            if (AndroidUtilities.navigationBarHeight > 0) {
                i11 = 0;
            } else {
                i11 = 10;
            }
            dp = AndroidUtilities.dp(i11 + 114);
        }
        z2Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setTranslationY(-AndroidUtilities.navigationBarHeight);
        }
        if (linearLayout != null) {
            int dp4 = AndroidUtilities.dp(10.0f);
            int dp5 = AndroidUtilities.dp(10.0f);
            int dp6 = AndroidUtilities.dp(10.0f);
            if (AndroidUtilities.navigationBarHeight > 0) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            linearLayout.setPadding(dp4, dp5, dp6, AndroidUtilities.dp(f11) + AndroidUtilities.navigationBarHeight);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        int dp7 = AndroidUtilities.dp(10.0f);
        TextView textView = this.f15873y;
        textView.setPadding(0, i12, dp7, 0);
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f10 = 18.0f;
                textView.setTextSize(f10);
                super.onMeasure(i9, i10);
            }
        }
        f10 = 20.0f;
        textView.setTextSize(f10);
        super.onMeasure(i9, i10);
    }

    public void setMaxCount(int i9) {
        this.N = i9;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            AndroidUtilities.updateVisibleRows(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.R = runnable;
    }

    public void setOnSelectListener(Utilities.Callback2<Object, Bitmap> callback2) {
        this.S = callback2;
    }

    public void setOnSelectMultipleListener(Utilities.Callback3<Boolean, ArrayList<MediaController.PhotoEntry>, ArrayList<Bitmap>> callback3) {
        this.T = callback3;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
