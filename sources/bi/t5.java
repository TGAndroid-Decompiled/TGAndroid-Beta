package bi;

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
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.es;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class t5 {
    public final int f3741a;
    public final ImageReceiver f3742b;
    public int f3743c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.g6 f3744f;
    public final org.telegram.ui.Components.g6 f3745g;
    public final org.telegram.ui.Components.g6 h;
    public float f3746i;
    public float f3747j;
    public float f3748k;
    public final boolean f3749l;
    public final RectF f3750m;
    public final RectF f3751n;

    public t5(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f3742b = imageReceiver;
        this.f3743c = 0;
        this.d = false;
        this.e = 1.0f;
        es esVar = es.h;
        this.f3744f = new org.telegram.ui.Components.g6(profileStoriesView, 420L, esVar);
        this.f3745g = new org.telegram.ui.Components.g6(profileStoriesView, 420L, esVar);
        this.h = new org.telegram.ui.Components.g6(profileStoriesView, 420L, esVar);
        this.f3750m = new RectF();
        this.f3751n = new RectF();
        this.f3741a = storyItem.f19151id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f3749l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f32537x) {
            imageReceiver.onAttachedToWindow();
        }
        b30[] b30VarArr = s9.f3644a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            k9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, k9Var);
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
