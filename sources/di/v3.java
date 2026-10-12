package di;

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
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wx0;
public abstract class v3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry f7976j0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable E;
    public final j3 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final ImageView H;
    public final LinearLayout I;
    public final d J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public int N;
    public final float O;
    public final boolean P;
    public boolean Q;
    public int R;
    public final org.telegram.ui.Components.g6 S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public Utilities.Callback2 W;
    public final int f7977a;
    public Utilities.Callback3 f7978a0;
    public final org.telegram.ui.ActionBar.c6 f7979b;
    public final ArrayList f7980b0;
    public final Paint f7981c;
    public boolean f7982c0;
    public final d3 d;
    public boolean f7983d0;
    public final e3 e;
    public MediaController.AlbumEntry f7984e0;
    public final n3 f7985f;
    public ArrayList f7986f0;
    public ArrayList f7987g0;
    public final FrameLayout h;
    public final ArrayList f7988h0;
    public bi.i5 f7989i0;
    public final mm0 f7990n;
    public final k3 f7991r;
    public final wx0 f7992s;
    public final h4 v;
    public boolean f7993w;
    public final org.telegram.ui.ActionBar.k f7994x;
    public final TextView f7995y;

    public v3(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f7, boolean z11, boolean z12) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f7981c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.g6(this, 0L, 350L, es.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.f7980b0 = arrayList;
        this.f7988h0 = new ArrayList();
        this.O = f7;
        this.f7977a = i10;
        this.f7979b = c6Var;
        this.L = z10;
        this.M = z11;
        this.P = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        d3 d3Var = new d3(this, context, c6Var);
        this.d = d3Var;
        d3Var.setItemSelectorColorProvider(new bi.w2(13));
        n3 n3Var = new n3(this);
        this.f7985f = n3Var;
        d3Var.setAdapter(n3Var);
        e3 e3Var = new e3(this);
        this.e = e3Var;
        d3Var.setLayoutManager(e3Var);
        d3Var.setFastScrollEnabled(1);
        d3Var.setFastScrollVisible(true);
        d3Var.getFastScroll().setAlpha(0.0f);
        e3Var.O = new f3(this);
        d3Var.i(new Object());
        d3Var.setClipToPadding(false);
        addView(d3Var, w7.a6.e(-1, -1, 119));
        d3Var.setOnItemClickListener(new am0(this) {
            public final v3 f8081b;

            {
                this.f8081b = this;
            }

            @Override
            public final void a(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        v3 v3Var = this.f8081b;
                        ArrayList arrayList2 = v3Var.f7980b0;
                        ArrayList arrayList3 = v3Var.f7988h0;
                        if (i11 >= 2 && v3Var.W != null && (view instanceof q3)) {
                            q3 q3Var = (q3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (v3Var.f7982c0) {
                                if (i12 == 0) {
                                    v3Var.e(v3.f7976j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (v3Var.f7983d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    k8 k8Var = (k8) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = v3Var.W;
                                    if (k8Var.K) {
                                        bitmap = v3.d(q3Var);
                                    }
                                    callback22.run(k8Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < v3Var.f7986f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) v3Var.f7986f0.get(i12);
                                if (arrayList3.isEmpty() && !v3Var.Q) {
                                    Utilities.Callback2 callback23 = v3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = v3.d(q3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > v3Var.R) {
                                    int i13 = -v3Var.N;
                                    v3Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(q3Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(v3Var.d);
                                v3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        v3 v3Var2 = this.f8081b;
                        k3 k3Var = v3Var2.f7991r;
                        org.telegram.ui.ActionBar.u0 u0Var = v3Var2.G;
                        if (u0Var != null) {
                            AndroidUtilities.hideKeyboard(u0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < k3Var.f7885c.size() && (callback2 = v3Var2.W) != null) {
                            callback2.run(k3Var.f7885c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        d3Var.setOnItemLongClickListener(new a1.c(this, 23));
        d3Var.setOnScrollListener(new h3(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var);
        this.f7994x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.B(436207615, false);
        kVar.D(-1, false);
        kVar.D(-1, true);
        addView(kVar, w7.a6.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new i3(this));
        org.telegram.ui.ActionBar.y n10 = kVar.n();
        j3 j3Var = new j3(this, context, n10, c6Var);
        this.F = j3Var;
        j3Var.setSubMenuOpenSide(1);
        if (AndroidUtilities.isTablet()) {
            f10 = 64.0f;
        } else {
            f10 = 56.0f;
        }
        kVar.addView(j3Var, 0, w7.a6.a(-1.0f, f10, 0.0f, 40.0f, 0.0f, -2, 51));
        j3Var.setOnClickListener(new View.OnClickListener(this) {
            public final v3 f8125b;

            {
                this.f8125b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f8125b.F.M(null, null);
                        return;
                    case 1:
                        v3 v3Var = this.f8125b;
                        if (v3Var.I.getAlpha() >= 0.25f) {
                            v3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        v3 v3Var2 = this.f8125b;
                        if (v3Var2.I.getAlpha() >= 0.25f) {
                            v3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f8125b.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f7995y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        float f11 = 10.0f;
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        j3Var.addView(textView, w7.a6.a(-2.0f, 16.0f, 0.0f, 0.0f, 0.0f, -2, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        mm0 mm0Var = new mm0(context, c6Var);
        this.f7990n = mm0Var;
        mm0Var.setLayoutManager(new s4.s(3));
        k3 k3Var = new k3(this);
        this.f7991r = k3Var;
        mm0Var.setAdapter(k3Var);
        mm0Var.setOnScrollListener(new l3(this));
        mm0Var.setClipToPadding(true);
        mm0Var.i(new Object());
        frameLayout.addView(mm0Var, w7.a6.e(-1, -1, 119));
        f10 f10Var = new f10(context, c6Var);
        f10Var.setViewType(2);
        f10Var.setAlpha(0.0f);
        f10Var.setVisibility(8);
        frameLayout.addView(f10Var, w7.a6.e(-1, -1, 119));
        wx0 wx0Var = new wx0(context, f10Var, 11, c6Var);
        this.f7992s = wx0Var;
        wh.n nVar = wx0Var.d;
        nVar.setTextSize(1, 16.0f);
        nVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20288y6, c6Var));
        nVar.setTypeface(null);
        nVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new h4(this, false, new bi.o1(this, 9));
        frameLayout.addView(wx0Var, w7.a6.e(-1, -1, 119));
        mm0Var.setEmptyView(wx0Var);
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new c3(this);
        this.G = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        mm0Var.setOnItemClickListener(new am0(this) {
            public final v3 f8081b;

            {
                this.f8081b = this;
            }

            @Override
            public final void a(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        v3 v3Var = this.f8081b;
                        ArrayList arrayList2 = v3Var.f7980b0;
                        ArrayList arrayList3 = v3Var.f7988h0;
                        if (i11 >= 2 && v3Var.W != null && (view instanceof q3)) {
                            q3 q3Var = (q3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (v3Var.f7982c0) {
                                if (i12 == 0) {
                                    v3Var.e(v3.f7976j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (v3Var.f7983d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    k8 k8Var = (k8) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = v3Var.W;
                                    if (k8Var.K) {
                                        bitmap = v3.d(q3Var);
                                    }
                                    callback22.run(k8Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < v3Var.f7986f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) v3Var.f7986f0.get(i12);
                                if (arrayList3.isEmpty() && !v3Var.Q) {
                                    Utilities.Callback2 callback23 = v3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = v3.d(q3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > v3Var.R) {
                                    int i13 = -v3Var.N;
                                    v3Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(q3Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(v3Var.d);
                                v3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        v3 v3Var2 = this.f8081b;
                        k3 k3Var2 = v3Var2.f7991r;
                        org.telegram.ui.ActionBar.u0 u0Var = v3Var2.G;
                        if (u0Var != null) {
                            AndroidUtilities.hideKeyboard(u0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < k3Var2.f7885c.size() && (callback2 = v3Var2.W) != null) {
                            callback2.run(k3Var2.f7885c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().f3980w.f6584b;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                k8 k8Var = (k8) obj;
                if (!k8Var.f7187g && !k8Var.f7216w) {
                    this.f7980b0.add(k8Var);
                }
            }
        }
        if (z11) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : f11) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d f12 = yh.f(24, context, c6Var, true);
            this.J = f12;
            f12.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(f12, w7.a6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                f12.setOnClickListener(new View.OnClickListener(this) {
                    public final v3 f8125b;

                    {
                        this.f8125b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f8125b.F.M(null, null);
                                return;
                            case 1:
                                v3 v3Var = this.f8125b;
                                if (v3Var.I.getAlpha() >= 0.25f) {
                                    v3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                v3 v3Var2 = this.f8125b;
                                if (v3Var2.I.getAlpha() >= 0.25f) {
                                    v3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f8125b.f(false);
                                return;
                        }
                    }
                });
            }
            d f13 = yh.f(24, context, c6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            br brVar = new br(R.drawable.mini_collage, 0);
            brVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(brVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            f13.g(spannableStringBuilder, false, true);
            linearLayout.addView(f13, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            f13.setOnClickListener(new View.OnClickListener(this) {
                public final v3 f8125b;

                {
                    this.f8125b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f8125b.F.M(null, null);
                            return;
                        case 1:
                            v3 v3Var = this.f8125b;
                            if (v3Var.I.getAlpha() >= 0.25f) {
                                v3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            v3 v3Var2 = this.f8125b;
                            if (v3Var2.I.getAlpha() >= 0.25f) {
                                v3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f8125b.f(false);
                            return;
                    }
                }
            });
        } else {
            this.I = null;
            this.J = null;
            ImageView imageView = new ImageView(context);
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
            w7.c6.b(imageView, 0.1f, 1.5f);
            addView(imageView, w7.a6.a(-2.0f, 0.0f, 0.0f, 14.0f, 14.0f, -2, 85));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final v3 f8125b;

                {
                    this.f8125b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f8125b.F.M(null, null);
                            return;
                        case 1:
                            v3 v3Var = this.f8125b;
                            if (v3Var.I.getAlpha() >= 0.25f) {
                                v3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            v3 v3Var2 = this.f8125b;
                            if (v3Var2.I.getAlpha() >= 0.25f) {
                                v3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f8125b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = f7976j0;
        if (albumEntry != null && (albumEntry != albumEntry2 || this.f7980b0.size() > 0)) {
            this.f7984e0 = albumEntry;
        } else {
            ArrayList arrayList3 = this.f7987g0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f7984e0 = (MediaController.AlbumEntry) this.f7987g0.get(0);
            } else {
                this.f7984e0 = MediaController.allMediaAlbumEntry;
            }
        }
        this.f7986f0 = b(this.f7984e0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.f7984e0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.f7995y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.f7995y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.f7995y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(q3 q3Var) {
        Bitmap bitmap;
        if (q3Var != null && (bitmap = q3Var.f7631a) != null && !bitmap.isRecycled()) {
            return Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
        }
        return null;
    }

    public final ArrayList b(MediaController.AlbumEntry albumEntry) {
        if (albumEntry == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < albumEntry.photos.size(); i10++) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            if (!this.L || !photoEntry.isVideo) {
                arrayList.add(photoEntry);
            }
        }
        return arrayList;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.albumsDidLoad;
        n3 n3Var = this.f7985f;
        int i13 = 0;
        if (i10 == i12) {
            h();
            if (this.f7984e0 != null) {
                while (true) {
                    if (i13 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                    int i14 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f7984e0;
                    if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f7984e0 = albumEntry;
                        break;
                    }
                    i13++;
                }
            } else {
                ArrayList arrayList = this.f7987g0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f7984e0 = (MediaController.AlbumEntry) this.f7987g0.get(0);
                } else {
                    this.f7984e0 = MediaController.allMediaAlbumEntry;
                }
            }
            this.f7986f0 = b(this.f7984e0);
            this.f7988h0.clear();
            i();
            if (n3Var != null) {
                n3Var.l();
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            ArrayList arrayList2 = this.f7980b0;
            arrayList2.clear();
            if (!this.L) {
                ArrayList arrayList3 = MessagesController.getInstance(this.f7977a).getStoriesController().f3980w.f6584b;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    k8 k8Var = (k8) obj;
                    if (!k8Var.f7187g && !k8Var.f7216w) {
                        arrayList2.add(k8Var);
                    }
                }
            }
            h();
            i();
            if (n3Var != null) {
                n3Var.l();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float g10 = g();
        int i10 = 0;
        if (g10 <= org.telegram.messenger.q.c(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.S.e(z10);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e);
        if (z10 != this.f7993w) {
            this.f7993w = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f7993w) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f7994x;
        if (kVar != null) {
            kVar.setAlpha(e);
            if (e <= 0.0f) {
                i10 = 8;
            }
            if (kVar.getVisibility() != i10) {
                kVar.setVisibility(i10);
            }
        }
        bi.i5 i5Var = this.f7989i0;
        if (i5Var != null) {
            i5Var.setAlpha(1.0f - e);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f7981c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z10) {
        this.f7984e0 = albumEntry;
        this.f7986f0 = b(albumEntry);
        this.f7988h0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.f7984e0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.f7995y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == f7976j0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f7985f.l();
        e3 e3Var = this.e;
        if (z10) {
            ki.o oVar = new ki.o(getContext(), 2);
            oVar.f44979a = 1;
            oVar.f14352p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            e3Var.w0(oVar);
            return;
        }
        e3Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        q3 q3Var;
        if (this.f7978a0 != null) {
            ArrayList arrayList = this.f7988h0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.W.run((MediaController.PhotoEntry) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    d3 d3Var = this.d;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < d3Var.getChildCount()) {
                                    View childAt = d3Var.getChildAt(i11);
                                    if (childAt instanceof q3) {
                                        q3Var = (q3) childAt;
                                        if (q3Var.S == photoEntry) {
                                            break;
                                        }
                                    }
                                    i11++;
                                } else {
                                    q3Var = null;
                                    break;
                                }
                            }
                            bitmap = d(q3Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.f7978a0.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        AndroidUtilities.updateVisibleRows(d3Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        d3 d3Var = this.d;
        if (d3Var != null && d3Var.getChildCount() > 0) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < d3Var.getChildCount(); i11++) {
                View childAt = d3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        } else {
            padding = getPadding();
        }
        if (d3Var == null) {
            return padding;
        }
        return AndroidUtilities.lerp(0, padding, d3Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.f7984e0;
    }

    public String getTitle() {
        int i10;
        if (this.L) {
            i10 = R.string.AddImage;
        } else {
            i10 = R.string.ChoosePhotoOrVideo;
        }
        return LocaleController.getString(i10);
    }

    public final void h() {
        a aVar;
        j3 j3Var = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j3Var.f20675b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f7987g0 = arrayList2;
        Collections.sort(arrayList2, new bi.q7(arrayList, 1));
        ArrayList arrayList3 = this.f7980b0;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = f7976j0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f7987g0;
            arrayList4.add(!arrayList4.isEmpty(), albumEntry);
        }
        boolean isEmpty2 = this.f7987g0.isEmpty();
        TextView textView = this.f7995y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.f7987g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.f7987g0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.f7979b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.f7979b);
                }
            }
            j3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bi.u1(4, this, albumEntry2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f7987g0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f7987g0.get(0) == this.f7984e0 && this.f7980b0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7982c0 = z10;
        if (z10 || (this.f7984e0 != f7976j0 && ((arrayList = this.f7987g0) == null || arrayList.isEmpty() || this.f7987g0.get(0) != this.f7984e0))) {
            z11 = false;
        }
        this.f7983d0 = z11;
    }

    public final void j() {
        float f7;
        float f10;
        int dp;
        ArrayList arrayList = this.f7988h0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z10 = !isEmpty;
        float f11 = 0.0f;
        float f12 = 1.0f;
        ImageView imageView = this.H;
        if (imageView != null) {
            ViewPropertyAnimator animate = imageView.animate();
            if (!isEmpty) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            float f13 = 0.7f;
            if (!isEmpty) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!isEmpty) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f13);
            if (!isEmpty) {
                dp = -AndroidUtilities.navigationBarHeight;
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            yh.s(scaleY.translationY(dp), es.h, 320L);
        }
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            d dVar = this.J;
            if (dVar != null) {
                dVar.g(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f14 = 10.0f;
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(10.0f);
            if (AndroidUtilities.navigationBarHeight > 0) {
                f14 = 0.0f;
            }
            linearLayout.setPadding(dp2, dp3, dp4, AndroidUtilities.dp(f14) + AndroidUtilities.navigationBarHeight);
            if (this.T != z10) {
                this.T = z10;
                linearLayout.setVisibility(0);
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (isEmpty) {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f12);
                if (isEmpty) {
                    f11 = AndroidUtilities.dp(32.0f);
                }
                alpha2.translationY(f11).setInterpolator(es.h).setDuration(320L).setListener(new ah.p0(10, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f7977a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f7977a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        q3.f7629e0.clear();
        q3.f7630f0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = q3.f7627c0;
            if (i10 < arrayList.size()) {
                ((DispatchQueue) arrayList.get(i10)).cleanupQueue();
                ((DispatchQueue) arrayList.get(i10)).recycle();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        float f7;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        d3 d3Var = this.d;
        d3Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int dp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int dp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.I;
        if (linearLayout == null) {
            dp = 0;
        } else {
            if (AndroidUtilities.navigationBarHeight > 0) {
                i12 = 0;
            } else {
                i12 = 10;
            }
            dp = AndroidUtilities.dp(i12 + 114);
        }
        d3Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
        ImageView imageView = this.H;
        if (imageView != null) {
            imageView.setTranslationY(-AndroidUtilities.navigationBarHeight);
        }
        if (linearLayout != null) {
            int dp4 = AndroidUtilities.dp(10.0f);
            int dp5 = AndroidUtilities.dp(10.0f);
            int dp6 = AndroidUtilities.dp(10.0f);
            if (AndroidUtilities.navigationBarHeight > 0) {
                f10 = 0.0f;
            } else {
                f10 = 10.0f;
            }
            linearLayout.setPadding(dp4, dp5, dp6, AndroidUtilities.dp(f10) + AndroidUtilities.navigationBarHeight);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        int i13 = AndroidUtilities.statusBarHeight;
        int dp7 = AndroidUtilities.dp(10.0f);
        TextView textView = this.f7995y;
        textView.setPadding(0, i13, dp7, 0);
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f7 = 18.0f;
                textView.setTextSize(f7);
                super.onMeasure(i10, i11);
            }
        }
        f7 = 20.0f;
        textView.setTextSize(f7);
        super.onMeasure(i10, i11);
    }

    public void setMaxCount(int i10) {
        this.R = i10;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            AndroidUtilities.updateVisibleRows(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.V = runnable;
    }

    public void setOnSelectListener(Utilities.Callback2<Object, Bitmap> callback2) {
        this.W = callback2;
    }

    public void setOnSelectMultipleListener(Utilities.Callback3<Boolean, ArrayList<MediaController.PhotoEntry>, ArrayList<Bitmap>> callback3) {
        this.f7978a0 = callback3;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
