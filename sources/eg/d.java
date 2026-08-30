package eg;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.yh;
public final class d extends rl0 {
    public final f6 f5239c;
    public final int d;
    public final int e;
    public final ArrayList f5240f;
    public final q1 h;
    public int f5241n;
    public c f5242r;
    public final boolean f5243s;

    public d(int i10, f6 f6Var) {
        ArrayList arrayList = new ArrayList();
        this.f5240f = arrayList;
        this.f5243s = true;
        this.f5239c = f6Var;
        q1 q1Var = new q1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, f6Var);
        this.h = q1Var;
        q1Var.f5465o = 0.0f;
        q1Var.f5466p = 0.0f;
        q1Var.f5467q = 1.0f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        arrayList.add(new e(messagesController.channelsLimitDefault, messagesController.channelsLimitPremium, LocaleController.getString(R.string.GroupsAndChannelsLimitTitle), LocaleController.formatString(R.string.GroupsAndChannelsLimitSubtitle, Integer.valueOf(messagesController.channelsLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersPinnedLimitDefault, messagesController.dialogFiltersPinnedLimitPremium, LocaleController.getString(R.string.PinChatsLimitTitle), LocaleController.formatString(R.string.PinChatsLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium))));
        arrayList.add(new e(messagesController.publicLinksLimitDefault, messagesController.publicLinksLimitPremium, LocaleController.getString(R.string.PublicLinksLimitTitle), LocaleController.formatString(R.string.PublicLinksLimitSubtitle, Integer.valueOf(messagesController.publicLinksLimitPremium))));
        arrayList.add(new e(messagesController.savedGifsLimitDefault, messagesController.savedGifsLimitPremium, LocaleController.getString(R.string.SavedGifsLimitTitle), LocaleController.formatString(R.string.SavedGifsLimitSubtitle, Integer.valueOf(messagesController.savedGifsLimitPremium))));
        arrayList.add(new e(messagesController.stickersFavedLimitDefault, messagesController.stickersFavedLimitPremium, LocaleController.getString(R.string.FavoriteStickersLimitTitle), LocaleController.formatString(R.string.FavoriteStickersLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.aboutLengthLimitDefault, messagesController.aboutLengthLimitPremium, LocaleController.getString(R.string.BioLimitTitle), LocaleController.formatString(R.string.BioLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.captionLengthLimitDefault, messagesController.captionLengthLimitPremium, LocaleController.getString(R.string.CaptionsLimitTitle), LocaleController.formatString(R.string.CaptionsLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersLimitDefault, messagesController.dialogFiltersLimitPremium, LocaleController.getString(R.string.FoldersLimitTitle), LocaleController.formatString(R.string.FoldersLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersChatsLimitDefault, messagesController.dialogFiltersChatsLimitPremium, LocaleController.getString(R.string.ChatPerFolderLimitTitle), LocaleController.formatString(R.string.ChatPerFolderLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersChatsLimitPremium))));
        arrayList.add(new e(3, 4, LocaleController.getString(R.string.ConnectedAccountsLimitTitle), LocaleController.formatString(R.string.ConnectedAccountsLimitSubtitle, 4)));
        arrayList.add(new e(messagesController.recommendedChannelsLimitDefault, messagesController.recommendedChannelsLimitPremium, LocaleController.getString(R.string.SimilarChannelsLimitTitle), LocaleController.formatString(R.string.SimilarChannelsLimitSubtitle, Integer.valueOf(messagesController.recommendedChannelsLimitPremium))));
        this.d = 1;
        this.e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
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
        if (i10 == 0) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        if (l1Var.f5788f == 0) {
            f fVar = (f) l1Var.f5785a;
            int i11 = i10 - this.e;
            ArrayList arrayList = this.f5240f;
            fVar.a((e) arrayList.get(i11));
            LimitPreviewView limitPreviewView = fVar.f5285c;
            limitPreviewView.C = ((e) arrayList.get(i11)).e;
            limitPreviewView.f23095c = this.f5241n;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        s3 s3Var;
        Context context = viewGroup.getContext();
        f6 f6Var = this.f5239c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? fVar = new f(context, f6Var);
                fVar.f5285c.setParentViewForGradien(this.f5242r);
                fVar.f5285c.setStaticGradinet(this.h);
                s3Var = fVar;
            } else {
                s3Var = new s3(context, 16);
            }
        } else if (this.f5243s) {
            ?? dVar = new dh.d(context, 2);
            LinearLayout f10 = y3.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(r1.c(context.getDrawable(R.drawable.other_2x_large), r1.d().f5482a));
            f10.addView(imageView, b6.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(j6.v0(j6.G6, f6Var));
            textView.setTypeface(AndroidUtilities.bold());
            f10.addView(textView, b6.e(-2, -2, 16));
            dVar.addView(f10, b6.e(-2, -2, 17));
            s3Var = dVar;
        } else {
            s3Var = new s3(context, 64);
        }
        return yh.o(s3Var, s3Var, -1, -2);
    }
}
