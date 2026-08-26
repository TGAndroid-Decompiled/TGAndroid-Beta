package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;
import com.google.android.gms.wearable.internal.zzfx;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda28;
import org.telegram.ui.WearAuthSheet;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.web.MHTML;

public class WearAuthListenerService extends WearableListenerService {
    public static final String PATH_CANCEL = "/tg-wear-auth/cancel";
    public static final String PATH_OFFER = "/tg-wear-auth/offer";

    public static void lambda$onMessageReceived$0(String str, String str2, byte[] bArr) {
        str.getClass();
        if (!str.equals("/tg-wear-auth/offer")) {
            if (!str.equals("/tg-wear-auth/cancel")) {
                FileLog.d("wear-auth: unexpected path ".concat(str));
                return;
            }
            FileLog.d("wear-auth: cancel from " + str2);
            BigInteger bigInteger = WearAuthSheet.DH_P;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            WearAuthSheet.currentSession = null;
            BottomSheet bottomSheet = WearAuthSheet.currentSheet;
            if (bottomSheet != null) {
                bottomSheet.lambda$showGiftOfferSheet$15();
                WearAuthSheet.currentSheet = null;
                return;
            }
            return;
        }
        StringBuilder sbM4m = SurfaceContainer$$ExternalSyntheticOutline0.m4m("wear-auth: offer from ", str2, " (");
        sbM4m.append(bArr.length);
        sbM4m.append(" bytes)");
        FileLog.d(sbM4m.toString());
        BigInteger bigInteger2 = WearAuthSheet.DH_P;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        MHTML mhtml = WearAuthSheet.currentSession;
        if (mhtml != null && Arrays.equals((byte[]) mhtml.file, bArrCopyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        StringBuilder sb = new StringBuilder("wear-auth: new session ");
        StringBuilder sb2 = new StringBuilder(bArrCopyOfRange.length * 2);
        for (byte b : bArrCopyOfRange) {
            sb2.append(String.format("%02x", Byte.valueOf(b)));
        }
        sb.append(sb2.toString());
        sb.append(" from ");
        sb.append(str2);
        FileLog.d(sb.toString());
        MHTML mhtml2 = new MHTML();
        mhtml2.file = bArrCopyOfRange;
        mhtml2.entriesByLocation = bArrCopyOfRange2;
        mhtml2.boundary = str2;
        WearAuthSheet.currentSession = mhtml2;
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        Theme.ResourcesProvider resourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        BottomSheet bottomSheet2 = WearAuthSheet.currentSheet;
        if (bottomSheet2 != null) {
            bottomSheet2.lambda$showGiftOfferSheet$15();
            WearAuthSheet.currentSheet = null;
        }
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourceProvider, false, false);
        FrameLayout frameLayout = new FrameLayout(context);
        bottomSheetM.customView = frameLayout;
        int i = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i2 = 0; i2 < 4; i2++) {
            if (UserConfig.getInstance(i2).isClientActivated()) {
                if (!ConnectionsManager.getInstance(i2).isTestBackend()) {
                    i = i2;
                }
                arrayList.add(Integer.valueOf(i2));
            }
        }
        Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda3(21));
        if (arrayList.isEmpty()) {
            return;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_dialogBackgroundGray, resourceProvider)));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
        backupImageView.getImageReceiver().setCrossfadeWithOldImage(true);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        int[] iArr = {UserConfig.selectedAccount};
        TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
        avatarDrawable.setInfo(UserConfig.selectedAccount, currentUser);
        backupImageView.imageReceiver.setForUserOrChat(currentUser, avatarDrawable);
        backupImageView.onNewImageSet();
        frameLayout3.addView(backupImageView, LayoutHelper.createFrame(28, 28, 115));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogTextGray3, resourceProvider), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, LayoutHelper.createFrame(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(frameLayout2, LayoutHelper.createLinear(-2, -2, 0.0f, 51, 6, 4, 6, 0));
        ScaleStateListAnimator.apply(frameLayout2, 0.1f, 1.5f);
        if (arrayList.size() <= 1) {
            frameLayout2.setVisibility(8);
        }
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        frameLayout.addView(linearLayoutM, LayoutHelper.createFrame(-1, -1, 119));
        BackupImageView backupImageView2 = new BackupImageView(context);
        linearLayoutM.addView(backupImageView2, LayoutHelper.createLinear(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
        MediaDataController.getInstance(i).setPlaceholderImage(backupImageView2, "Utya3D", "😎", "130_130");
        int i3 = Theme.key_dialogTextBlack;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i3, true, resourceProvider);
        textViewMakeTextView.setGravity(17);
        textViewMakeTextView.setText(LocaleController.getString(R.string.WearAuthTitle));
        linearLayoutM.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i3, false, null);
        textViewMakeTextView2.setGravity(17);
        textViewMakeTextView2.setText(LocaleController.getString(R.string.WearAuthText));
        linearLayoutM.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 49, 32, 0, 32, 24));
        ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourceProvider, true);
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.Next));
        linearLayoutM.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 7, 12, 12, 12, 8));
        int i4 = Theme.key_windowBackgroundGray;
        bottomSheetM.setBackgroundColor(Theme.getColor(i4, resourceProvider));
        bottomSheetM.fixNavigationBar(Theme.getColor(i4, resourceProvider));
        frameLayout2.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda1(bottomSheetM, frameLayout3, arrayList, iArr, avatarDrawable, backupImageView, 0));
        buttonWithCounterViewM.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(3, buttonWithCounterViewM, iArr));
        WearAuthSheet.currentSheet = bottomSheetM;
        bottomSheetM.show();
    }

    @Override
    public void onMessageReceived(MessageEvent messageEvent) {
        zzfx zzfxVar = (zzfx) messageEvent;
        String str = zzfxVar.zzb;
        if ("/tg-wear-auth/offer".equals(str)) {
            try {
                Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e);
            }
        }
        AndroidUtilities.runOnUIThread(new Utilities$$ExternalSyntheticLambda1(str, zzfxVar.zzd, zzfxVar.zzc, 28));
    }
}
