package ei;

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
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yq;
public abstract class q3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry f9620j0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable E;
    public final f3 F;
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
    public final org.telegram.ui.Components.f6 S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public Utilities.Callback2 W;
    public final int f9621a;
    public Utilities.Callback3 f9622a0;
    public final org.telegram.ui.ActionBar.d6 f9623b;
    public final ArrayList f9624b0;
    public final Paint f9625c;
    public boolean f9626c0;
    public final z2 d;
    public boolean f9627d0;
    public final a3 e;
    public MediaController.AlbumEntry f9628e0;
    public final j3 f9629f;
    public ArrayList f9630f0;
    public ArrayList f9631g0;
    public final FrameLayout h;
    public final ArrayList f9632h0;
    public ci.i4 f9633i0;
    public final jm0 f9634n;
    public final g3 f9635r;
    public final tx0 f9636s;
    public final b4 v;
    public boolean f9637w;
    public final org.telegram.ui.ActionBar.k f9638x;
    public final TextView f9639y;

    public q3(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f7, boolean z11, boolean z12) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f9625c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.f6(this, 0L, 350L, bs.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.f9624b0 = arrayList;
        this.f9632h0 = new ArrayList();
        this.O = f7;
        this.f9621a = i10;
        this.f9623b = d6Var;
        this.L = z10;
        this.M = z11;
        this.P = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        z2 z2Var = new z2(this, context, d6Var);
        this.d = z2Var;
        z2Var.setItemSelectorColorProvider(new ci.i1(15));
        j3 j3Var = new j3(this);
        this.f9629f = j3Var;
        z2Var.setAdapter(j3Var);
        a3 a3Var = new a3(this);
        this.e = a3Var;
        z2Var.setLayoutManager(a3Var);
        z2Var.setFastScrollEnabled(1);
        z2Var.setFastScrollVisible(true);
        z2Var.getFastScroll().setAlpha(0.0f);
        a3Var.O = new b3(this);
        z2Var.i(new Object());
        z2Var.setClipToPadding(false);
        addView(z2Var, w7.z5.e(-1, -1, 119));
        z2Var.setOnItemClickListener(new xl0(this) {
            public final q3 f9845b;

            {
                this.f9845b = this;
            }

            @Override
            public final void a(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        q3 q3Var = this.f9845b;
                        ArrayList arrayList2 = q3Var.f9624b0;
                        ArrayList arrayList3 = q3Var.f9632h0;
                        if (i11 >= 2 && q3Var.W != null && (view instanceof m3)) {
                            m3 m3Var = (m3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (q3Var.f9626c0) {
                                if (i12 == 0) {
                                    q3Var.e(q3.f9620j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (q3Var.f9627d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    a8 a8Var = (a8) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = q3Var.W;
                                    if (a8Var.K) {
                                        bitmap = q3.d(m3Var);
                                    }
                                    callback22.run(a8Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < q3Var.f9630f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.f9630f0.get(i12);
                                if (arrayList3.isEmpty() && !q3Var.Q) {
                                    Utilities.Callback2 callback23 = q3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = q3.d(m3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > q3Var.R) {
                                    int i13 = -q3Var.N;
                                    q3Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(m3Var, i13);
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
                        q3 q3Var2 = this.f9845b;
                        g3 g3Var = q3Var2.f9635r;
                        org.telegram.ui.ActionBar.u0 u0Var = q3Var2.G;
                        if (u0Var != null) {
                            AndroidUtilities.hideKeyboard(u0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < g3Var.f9582c.size() && (callback2 = q3Var2.W) != null) {
                            callback2.run(g3Var.f9582c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        z2Var.setOnItemLongClickListener(new e1.c(this, 4));
        z2Var.setOnScrollListener(new d3(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var);
        this.f9638x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.B(436207615, false);
        kVar.C(-1, false);
        kVar.C(-1, true);
        addView(kVar, w7.z5.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new e3(this));
        org.telegram.ui.ActionBar.y n10 = kVar.n();
        f3 f3Var = new f3(this, context, n10, d6Var);
        this.F = f3Var;
        f3Var.setSubMenuOpenSide(1);
        if (AndroidUtilities.isTablet()) {
            f10 = 64.0f;
        } else {
            f10 = 56.0f;
        }
        kVar.addView(f3Var, 0, w7.z5.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        f3Var.setOnClickListener(new View.OnClickListener(this) {
            public final q3 f9884b;

            {
                this.f9884b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9884b.F.M(null, null);
                        return;
                    case 1:
                        q3 q3Var = this.f9884b;
                        if (q3Var.I.getAlpha() >= 0.25f) {
                            q3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        q3 q3Var2 = this.f9884b;
                        if (q3Var2.I.getAlpha() >= 0.25f) {
                            q3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f9884b.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f9639y = textView;
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
        f3Var.addView(textView, w7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        jm0 jm0Var = new jm0(context, d6Var);
        this.f9634n = jm0Var;
        jm0Var.setLayoutManager(new s4.s(3));
        g3 g3Var = new g3(this);
        this.f9635r = g3Var;
        jm0Var.setAdapter(g3Var);
        jm0Var.setOnScrollListener(new h3(this));
        jm0Var.setClipToPadding(true);
        jm0Var.i(new Object());
        frameLayout.addView(jm0Var, w7.z5.e(-1, -1, 119));
        b10 b10Var = new b10(context, d6Var);
        b10Var.setViewType(2);
        b10Var.setAlpha(0.0f);
        b10Var.setVisibility(8);
        frameLayout.addView(b10Var, w7.z5.e(-1, -1, 119));
        tx0 tx0Var = new tx0(context, b10Var, 11, d6Var);
        this.f9636s = tx0Var;
        wh.n nVar = tx0Var.d;
        nVar.setTextSize(1, 16.0f);
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21381y6, d6Var));
        nVar.setTypeface(null);
        nVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new b4(this, false, new ai.r0(this, 15));
        frameLayout.addView(tx0Var, w7.z5.e(-1, -1, 119));
        jm0Var.setEmptyView(tx0Var);
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new y2(this);
        this.G = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        jm0Var.setOnItemClickListener(new xl0(this) {
            public final q3 f9845b;

            {
                this.f9845b = this;
            }

            @Override
            public final void a(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        q3 q3Var = this.f9845b;
                        ArrayList arrayList2 = q3Var.f9624b0;
                        ArrayList arrayList3 = q3Var.f9632h0;
                        if (i11 >= 2 && q3Var.W != null && (view instanceof m3)) {
                            m3 m3Var = (m3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (q3Var.f9626c0) {
                                if (i12 == 0) {
                                    q3Var.e(q3.f9620j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (q3Var.f9627d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    a8 a8Var = (a8) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = q3Var.W;
                                    if (a8Var.K) {
                                        bitmap = q3.d(m3Var);
                                    }
                                    callback22.run(a8Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < q3Var.f9630f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.f9630f0.get(i12);
                                if (arrayList3.isEmpty() && !q3Var.Q) {
                                    Utilities.Callback2 callback23 = q3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = q3.d(m3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > q3Var.R) {
                                    int i13 = -q3Var.N;
                                    q3Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(m3Var, i13);
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
                        q3 q3Var2 = this.f9845b;
                        g3 g3Var2 = q3Var2.f9635r;
                        org.telegram.ui.ActionBar.u0 u0Var = q3Var2.G;
                        if (u0Var != null) {
                            AndroidUtilities.hideKeyboard(u0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < g3Var2.f9582c.size() && (callback2 = q3Var2.W) != null) {
                            callback2.run(g3Var2.f9582c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().f5509w.f8673b;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                a8 a8Var = (a8) obj;
                if (!a8Var.f8709g && !a8Var.f8738w) {
                    this.f9624b0.add(a8Var);
                }
            }
        }
        if (z11) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, d6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : f11) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, w7.z5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d f12 = ok.f(24, context, d6Var, true);
            this.J = f12;
            f12.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(f12, w7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                f12.setOnClickListener(new View.OnClickListener(this) {
                    public final q3 f9884b;

                    {
                        this.f9884b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f9884b.F.M(null, null);
                                return;
                            case 1:
                                q3 q3Var = this.f9884b;
                                if (q3Var.I.getAlpha() >= 0.25f) {
                                    q3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                q3 q3Var2 = this.f9884b;
                                if (q3Var2.I.getAlpha() >= 0.25f) {
                                    q3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f9884b.f(false);
                                return;
                        }
                    }
                });
            }
            d f13 = ok.f(24, context, d6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            yq yqVar = new yq(R.drawable.mini_collage, 0);
            yqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            f13.g(spannableStringBuilder, false, true);
            linearLayout.addView(f13, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            f13.setOnClickListener(new View.OnClickListener(this) {
                public final q3 f9884b;

                {
                    this.f9884b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f9884b.F.M(null, null);
                            return;
                        case 1:
                            q3 q3Var = this.f9884b;
                            if (q3Var.I.getAlpha() >= 0.25f) {
                                q3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            q3 q3Var2 = this.f9884b;
                            if (q3Var2.I.getAlpha() >= 0.25f) {
                                q3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f9884b.f(false);
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
            imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
            w7.b6.b(imageView, 0.1f, 1.5f);
            addView(imageView, w7.z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final q3 f9884b;

                {
                    this.f9884b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f9884b.F.M(null, null);
                            return;
                        case 1:
                            q3 q3Var = this.f9884b;
                            if (q3Var.I.getAlpha() >= 0.25f) {
                                q3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            q3 q3Var2 = this.f9884b;
                            if (q3Var2.I.getAlpha() >= 0.25f) {
                                q3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f9884b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = f9620j0;
        if (albumEntry != null && (albumEntry != albumEntry2 || this.f9624b0.size() > 0)) {
            this.f9628e0 = albumEntry;
        } else {
            ArrayList arrayList3 = this.f9631g0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f9628e0 = (MediaController.AlbumEntry) this.f9631g0.get(0);
            } else {
                this.f9628e0 = MediaController.allMediaAlbumEntry;
            }
        }
        this.f9630f0 = b(this.f9628e0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.f9628e0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.f9639y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.f9639y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.f9639y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(m3 m3Var) {
        Bitmap bitmap;
        if (m3Var != null && (bitmap = m3Var.f9450a) != null && !bitmap.isRecycled()) {
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
        j3 j3Var = this.f9629f;
        int i13 = 0;
        if (i10 == i12) {
            h();
            if (this.f9628e0 != null) {
                while (true) {
                    if (i13 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                    int i14 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f9628e0;
                    if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f9628e0 = albumEntry;
                        break;
                    }
                    i13++;
                }
            } else {
                ArrayList arrayList = this.f9631g0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f9628e0 = (MediaController.AlbumEntry) this.f9631g0.get(0);
                } else {
                    this.f9628e0 = MediaController.allMediaAlbumEntry;
                }
            }
            this.f9630f0 = b(this.f9628e0);
            this.f9632h0.clear();
            i();
            if (j3Var != null) {
                j3Var.l();
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            ArrayList arrayList2 = this.f9624b0;
            arrayList2.clear();
            if (!this.L) {
                ArrayList arrayList3 = MessagesController.getInstance(this.f9621a).getStoriesController().f5509w.f8673b;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    a8 a8Var = (a8) obj;
                    if (!a8Var.f8709g && !a8Var.f8738w) {
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
        float f7;
        float g10 = g();
        int i10 = 0;
        if (g10 <= org.telegram.messenger.g0.b(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.S.e(z10);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e);
        if (z10 != this.f9637w) {
            this.f9637w = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f9637w) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f9638x;
        if (kVar != null) {
            kVar.setAlpha(e);
            if (e <= 0.0f) {
                i10 = 8;
            }
            if (kVar.getVisibility() != i10) {
                kVar.setVisibility(i10);
            }
        }
        ci.i4 i4Var = this.f9633i0;
        if (i4Var != null) {
            i4Var.setAlpha(1.0f - e);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f9625c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z10) {
        this.f9628e0 = albumEntry;
        this.f9630f0 = b(albumEntry);
        this.f9632h0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.f9628e0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.f9639y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == f9620j0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f9629f.l();
        a3 a3Var = this.e;
        if (z10) {
            li.n nVar = new li.n(getContext(), 2);
            nVar.f46061a = 1;
            nVar.f16144p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            a3Var.w0(nVar);
            return;
        }
        a3Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        m3 m3Var;
        if (this.f9622a0 != null) {
            ArrayList arrayList = this.f9632h0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.W.run((MediaController.PhotoEntry) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    z2 z2Var = this.d;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < z2Var.getChildCount()) {
                                    View childAt = z2Var.getChildAt(i11);
                                    if (childAt instanceof m3) {
                                        m3Var = (m3) childAt;
                                        if (m3Var.S == photoEntry) {
                                            break;
                                        }
                                    }
                                    i11++;
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
                        this.f9622a0.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
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
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < z2Var.getChildCount(); i11++) {
                View childAt = z2Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
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
        return this.f9628e0;
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
        f3 f3Var = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f3Var.f21735b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f9631g0 = arrayList2;
        Collections.sort(arrayList2, new ai.u5(arrayList, 2));
        ArrayList arrayList3 = this.f9624b0;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = f9620j0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f9631g0;
            arrayList4.add(!arrayList4.isEmpty(), albumEntry);
        }
        boolean isEmpty2 = this.f9631g0.isEmpty();
        TextView textView = this.f9639y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.f9631g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.f9631g0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.f9623b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.f9623b);
                }
            }
            f3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.p(14, this, albumEntry2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f9631g0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f9631g0.get(0) == this.f9628e0 && this.f9624b0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9626c0 = z10;
        if (z10 || (this.f9628e0 != f9620j0 && ((arrayList = this.f9631g0) == null || arrayList.isEmpty() || this.f9631g0.get(0) != this.f9628e0))) {
            z11 = false;
        }
        this.f9627d0 = z11;
    }

    public final void j() {
        float f7;
        float f10;
        int dp;
        ArrayList arrayList = this.f9632h0;
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
            ok.t(scaleY.translationY(dp), bs.h, 320L);
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
                alpha2.translationY(f11).setInterpolator(bs.h).setDuration(320L).setListener(new ah.p0(10, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f9621a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f9621a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        m3.f9448e0.clear();
        m3.f9449f0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = m3.f9446c0;
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
        z2 z2Var = this.d;
        z2Var.setPinnedSectionOffsetY(currentActionBarHeight);
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
        z2Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
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
        TextView textView = this.f9639y;
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
        this.f9622a0 = callback3;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
