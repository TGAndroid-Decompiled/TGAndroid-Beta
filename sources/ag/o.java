package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class o extends b {
    public final ArrayList d;

    public final Bitmap f576e;

    public final int f577f;

    public o(Context context, int i10, c6 c6Var) {
        SparseIntArray sparseIntArray;
        super(context, c6Var);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f577f = i10;
        ArrayList arrayList2 = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        if (i10 != 0) {
            if (i10 == 1) {
                sparseIntArray = messagesController.businessFeaturesTypesToPosition;
                arrayList2.add(new m(R.drawable.menu_premium_location, 29, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
                arrayList2.add(new m(R.drawable.menu_premium_clock, 30, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
                arrayList2.add(new m(R.drawable.menu_quickreply, 31, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
                arrayList2.add(new m(R.drawable.menu_feature_status, 32, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
                arrayList2.add(new m(R.drawable.menu_premium_away, 33, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
                arrayList2.add(new m(R.drawable.menu_premium_chatbot, 34, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
                arrayList2.add(new m(R.drawable.menu_feature_intro, 36, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
                arrayList2.add(new m(R.drawable.menu_premium_chatlink, 37, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            }
            if (sparseIntArray != null) {
                Collections.sort(arrayList2, new h(sparseIntArray, 0));
            }
            arrayList.add(new m(0));
            arrayList.addAll(arrayList2);
            arrayList.add(new m(2));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
            this.f576e = bitmapCreateBitmap;
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 0.0f, new int[]{g6.w0(null, g6.Lj, false), g6.w0(null, g6.Mj, false), g6.w0(null, g6.Nj, false), g6.w0(null, g6.Oj, false)}, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
        }
        arrayList2.add(new m(R.drawable.msg_stories_order, 20, LocaleController.getString(R.string.PremiumStoriesPriority), LocaleController.getString(R.string.PremiumStoriesPriorityDescription)));
        arrayList2.add(new m(R.drawable.msg_stories_stealth, 15, LocaleController.getString(R.string.PremiumStoriesStealth), LocaleController.getString(R.string.PremiumStoriesStealthDescription)));
        arrayList2.add(new m(R.drawable.menu_quality_hd, 25, LocaleController.getString(R.string.PremiumStoriesQuality), LocaleController.getString(R.string.PremiumStoriesQualityDescription)));
        arrayList2.add(new m(R.drawable.msg_stories_views, 16, LocaleController.getString(R.string.PremiumStoriesViews), LocaleController.getString(R.string.PremiumStoriesViewsDescription)));
        arrayList2.add(new m(R.drawable.msg_stories_timer, 17, LocaleController.getString(R.string.PremiumStoriesExpiration), LocaleController.getString(R.string.PremiumStoriesExpirationDescription)));
        arrayList2.add(new m(R.drawable.msg_stories_save, 18, LocaleController.getString(R.string.PremiumStoriesSaveToGallery), LocaleController.getString(R.string.PremiumStoriesSaveToGalleryDescription)));
        arrayList2.add(new m(R.drawable.msg_stories_caption, 21, LocaleController.getString(R.string.PremiumStoriesCaption), LocaleController.getString(R.string.PremiumStoriesCaptionDescription)));
        arrayList2.add(new m(R.drawable.msg_stories_link, 19, LocaleController.getString(R.string.PremiumStoriesFormatting), LocaleController.getString(R.string.PremiumStoriesFormattingDescription)));
        sparseIntArray = null;
        if (sparseIntArray != null) {
            Collections.sort(arrayList2, new h(sparseIntArray, 0));
        }
        arrayList.add(new m(0));
        arrayList.addAll(arrayList2);
        arrayList.add(new m(2));
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
        this.f576e = bitmapCreateBitmap2;
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 0.0f, bitmapCreateBitmap2.getWidth(), 0.0f, new int[]{g6.w0(null, g6.Lj, false), g6.w0(null, g6.Mj, false), g6.w0(null, g6.Nj, false), g6.w0(null, g6.Oj, false)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight(), paint2);
    }

    @Override
    public final f2.q0 a() {
        return new i(this, 0);
    }
}
