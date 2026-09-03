package oh;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class m6 {
    public int f17441a;
    public String f17442b;
    public TLRPC.Photo f17443c;
    public TLRPC.Document d;

    public static m6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f17441a = tL_storyAlbum.album_id;
        obj.f17442b = tL_storyAlbum.title;
        obj.f17443c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
