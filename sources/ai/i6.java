package ai;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.is;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class i6 {
    public final int f1140a;
    public final ImageReceiver f1141b;
    public int f1142c;
    public boolean d;
    public float f1143e;
    public final org.telegram.ui.Components.g6 f1144f;
    public final org.telegram.ui.Components.g6 f1145g;
    public final org.telegram.ui.Components.g6 h;
    public float f1146i;
    public float f1147j;
    public float f1148k;
    public final boolean f1149l;
    public final RectF f1150m;
    public final RectF f1151n;

    public i6(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f1141b = imageReceiver;
        this.f1142c = 0;
        this.d = false;
        this.f1143e = 1.0f;
        is isVar = is.h;
        this.f1144f = new org.telegram.ui.Components.g6(profileStoriesView, 420L, isVar);
        this.f1145g = new org.telegram.ui.Components.g6(profileStoriesView, 420L, isVar);
        this.h = new org.telegram.ui.Components.g6(profileStoriesView, 420L, isVar);
        this.f1150m = new RectF();
        this.f1151n = new RectF();
        this.f1140a = storyItem.f20269id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f1149l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f34552x) {
            imageReceiver.onAttachedToWindow();
        }
        g30[] g30VarArr = ja.f1195a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            j9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, j9Var);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.clearImage();
            }
        }
    }
}
