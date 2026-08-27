package ag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.yk0;

public final class e extends yk0 {

    public final c6 f344c;
    public final int d;

    public final int f345e;

    public final ArrayList f346f;
    public final i2 h;

    public int f347n;

    public c f348r;

    public final boolean f349s;

    public e(int i10, c6 c6Var) {
        ArrayList arrayList = new ArrayList();
        this.f346f = arrayList;
        this.f349s = true;
        this.f344c = c6Var;
        i2 i2Var = new i2(g6.Lj, g6.Mj, g6.Nj, g6.Oj, c6Var);
        this.h = i2Var;
        i2Var.f466o = 0.0f;
        i2Var.f467p = 0.0f;
        i2Var.f468q = 1.0f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        arrayList.add(new f(messagesController.channelsLimitDefault, messagesController.channelsLimitPremium, LocaleController.getString(R.string.GroupsAndChannelsLimitTitle), LocaleController.formatString(R.string.GroupsAndChannelsLimitSubtitle, Integer.valueOf(messagesController.channelsLimitPremium))));
        arrayList.add(new f(messagesController.dialogFiltersPinnedLimitDefault, messagesController.dialogFiltersPinnedLimitPremium, LocaleController.getString(R.string.PinChatsLimitTitle), LocaleController.formatString(R.string.PinChatsLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium))));
        arrayList.add(new f(messagesController.publicLinksLimitDefault, messagesController.publicLinksLimitPremium, LocaleController.getString(R.string.PublicLinksLimitTitle), LocaleController.formatString(R.string.PublicLinksLimitSubtitle, Integer.valueOf(messagesController.publicLinksLimitPremium))));
        arrayList.add(new f(messagesController.savedGifsLimitDefault, messagesController.savedGifsLimitPremium, LocaleController.getString(R.string.SavedGifsLimitTitle), LocaleController.formatString(R.string.SavedGifsLimitSubtitle, Integer.valueOf(messagesController.savedGifsLimitPremium))));
        arrayList.add(new f(messagesController.stickersFavedLimitDefault, messagesController.stickersFavedLimitPremium, LocaleController.getString(R.string.FavoriteStickersLimitTitle), LocaleController.formatString(R.string.FavoriteStickersLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new f(messagesController.aboutLengthLimitDefault, messagesController.aboutLengthLimitPremium, LocaleController.getString(R.string.BioLimitTitle), LocaleController.formatString(R.string.BioLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new f(messagesController.captionLengthLimitDefault, messagesController.captionLengthLimitPremium, LocaleController.getString(R.string.CaptionsLimitTitle), LocaleController.formatString(R.string.CaptionsLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new f(messagesController.dialogFiltersLimitDefault, messagesController.dialogFiltersLimitPremium, LocaleController.getString(R.string.FoldersLimitTitle), LocaleController.formatString(R.string.FoldersLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersLimitPremium))));
        arrayList.add(new f(messagesController.dialogFiltersChatsLimitDefault, messagesController.dialogFiltersChatsLimitPremium, LocaleController.getString(R.string.ChatPerFolderLimitTitle), LocaleController.formatString(R.string.ChatPerFolderLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersChatsLimitPremium))));
        arrayList.add(new f(3, 4, LocaleController.getString(R.string.ConnectedAccountsLimitTitle), LocaleController.formatString(R.string.ConnectedAccountsLimitSubtitle, 4)));
        arrayList.add(new f(messagesController.recommendedChannelsLimitDefault, messagesController.recommendedChannelsLimitPremium, LocaleController.getString(R.string.SimilarChannelsLimitTitle), LocaleController.formatString(R.string.SimilarChannelsLimitSubtitle, Integer.valueOf(messagesController.recommendedChannelsLimitPremium))));
        this.d = 1;
        this.f345e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f5793f == 0) {
            g gVar = (g) o1Var.f5789a;
            int i11 = i10 - this.f345e;
            ArrayList arrayList = this.f346f;
            gVar.a((f) arrayList.get(i11));
            LimitPreviewView limitPreviewView = gVar.f383c;
            limitPreviewView.B = ((f) arrayList.get(i11)).f371e;
            limitPreviewView.f26447c = this.f347n;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View q3Var;
        Context context = viewGroup.getContext();
        c6 c6Var = this.f344c;
        if (i10 != 1) {
            if (i10 != 2) {
                g gVar = new g(context, c6Var);
                gVar.f383c.setParentViewForGradien(this.f348r);
                gVar.f383c.setStaticGradinet(this.h);
                q3Var = gVar;
            } else {
                q3Var = new q3(context, 16);
            }
        } else if (this.f349s) {
            d dVar = new d(context, 0);
            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(j2.c(context.getDrawable(R.drawable.other_2x_large), j2.d().f492a));
            linearLayoutG.addView(imageView, z5.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(g6.v0(g6.G6, c6Var));
            textView.setTypeface(AndroidUtilities.bold());
            linearLayoutG.addView(textView, z5.e(-2, -2, 16));
            dVar.addView(linearLayoutG, z5.e(-2, -2, 17));
            q3Var = dVar;
        } else {
            q3Var = new q3(context, 64);
        }
        return pa.l(q3Var, q3Var, -1, -2);
    }
}
