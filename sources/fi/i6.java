package fi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 {
    public int f12112a;
    public String f12113b;
    public TLRPC.Photo f12114c;
    public TLRPC.Document d;

    public static i6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f12112a = tL_storyAlbum.album_id;
        obj.f12113b = tL_storyAlbum.title;
        obj.f12114c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
