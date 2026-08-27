package jh;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.recorder.StoryUploadingService;

public final class r6 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject A;
    public VideoEditedInfo B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final long F;
    public MessageObject G;
    public TL_bots.botPreviewMedia H;
    public final s6 I;

    public final boolean f13906b;

    public final lh.z7 f13907c;
    public boolean d;

    public String f13908e;

    public final String f13909f;
    public float h;

    public float f13910n;

    public float f13911r;

    public boolean f13912s;
    public boolean v;

    public int f13913w;

    public long f13915y;

    public long f13914x = -1;

    public final long f13905a = Utilities.random.nextLong();

    public r6(s6 s6Var, lh.z7 z7Var) {
        this.I = s6Var;
        this.f13907c = z7Var;
        this.f13906b = z7Var.f17209g;
        File file = z7Var.N0;
        if (file != null) {
            this.f13909f = file.getAbsolutePath();
        }
        boolean z10 = z7Var.f17238w;
        this.D = z10;
        this.E = z10;
        long j10 = z7Var.J0;
        if (j10 != 0) {
            this.F = j10;
            return;
        }
        if (z7Var.f17209g) {
            this.F = z7Var.f17204e;
            return;
        }
        TLRPC.InputPeer inputPeer = z7Var.f17237v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.F = UserConfig.getInstance(s6Var.f13955a).clientUserId;
        } else {
            this.F = DialogObject.getPeerDialogId(inputPeer);
        }
    }

    public final void a() {
        boolean z10 = this.E;
        lh.z7 z7Var = this.f13907c;
        s6 s6Var = this.I;
        if (z10) {
            s6Var.f13974w.c(z7Var);
            ((ArrayList) s6Var.f13956b.f(this.F)).remove(this);
        }
        this.v = true;
        if (z7Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.A);
        }
        FileLoader.getInstance(s6Var.f13955a).cancelFileUpload(this.f13908e, false);
        if (this.f13913w >= 0) {
            ConnectionsManager.getInstance(s6Var.f13955a).cancelRequest(this.f13913w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        kh.v vVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        kh.v vVar2;
        LongSparseArray longSparseArray4;
        HashMap map;
        ArrayList arrayList;
        s6 s6Var = this.I;
        int i10 = s6Var.f13955a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.E;
        long j10 = this.F;
        if (!z10 && (arrayList = (ArrayList) s6Var.f13956b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) s6Var.f13957c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                s6Var.d = 0;
            } else {
                s6Var.d++;
            }
        }
        boolean z11 = this.f13906b;
        lh.z7 z7Var = this.f13907c;
        if (z11 && (map = (HashMap) s6Var.f13958e.f(j10)) != null) {
            map.remove(Integer.valueOf(z7Var.f17207f));
        }
        if (this.H != null) {
            j6 j6VarA = s6Var.A(this.F, 4, -1, false);
            if (z7Var == null || !z7Var.f17209g) {
                if (j6VarA instanceof b6) {
                    ((b6) j6VarA).I(this.H);
                }
                String str = z7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.H;
                LongSparseArray longSparseArray5 = kh.v.B;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    b6 b6Var = (b6) longSparseArray2.get(j10);
                    int i11 = b6Var.f13536c;
                    ArrayList arrayList3 = b6Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(b6Var.E, str)) {
                            b6Var.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            g6 g6Var = b6Var.f13548q;
                            AndroidUtilities.cancelRunOnUIThread(g6Var);
                            AndroidUtilities.runOnUIThread(g6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = kh.v.A;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i10)) != null && (vVar = (kh.v) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList4 = vVar.f15233f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        b6 b6Var2 = (b6) arrayList4.get(i12);
                        if (b6Var2.f13536c == i10 && TextUtils.equals(b6Var2.E, str)) {
                            b6Var2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (j6VarA instanceof b6) {
                    ((b6) j6VarA).G(z7Var.L0, this.H);
                }
                String str2 = z7Var.K0;
                TLRPC.InputMedia inputMedia = z7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.H;
                LongSparseArray longSparseArray7 = kh.v.B;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    b6 b6Var3 = (b6) longSparseArray4.get(j10);
                    int i13 = b6Var3.f13536c;
                    ArrayList arrayList5 = b6Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(b6Var3.E, str2)) {
                            b6Var3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            g6 g6Var2 = b6Var3.f13548q;
                            AndroidUtilities.cancelRunOnUIThread(g6Var2);
                            AndroidUtilities.runOnUIThread(g6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = kh.v.A;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i10)) != null && (vVar2 = (kh.v) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList6 = vVar2.f15233f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        b6 b6Var4 = (b6) arrayList6.get(i14);
                        if (b6Var4.f13536c == i10 && TextUtils.equals(b6Var4.E, str2)) {
                            b6Var4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.H = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (z7Var != null && !z7Var.h && !this.d) {
            z7Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.f13908e);
    }

    public final void c(TLRPC.InputFile inputFile) {
        TLRPC.InputMedia inputMedia;
        boolean z10;
        int i10;
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.MessageMedia messageMedia;
        TLRPC.InputMedia inputMedia2;
        int i11 = this.I.f13955a;
        if (this.v) {
            return;
        }
        lh.z7 z7Var = this.f13907c;
        z7Var.getClass();
        ArrayList arrayList3 = z7Var.F0;
        if (!z7Var.f17221n || z7Var.f17214j || (messageMedia = z7Var.f17233t) == null) {
            inputMedia = null;
            z10 = false;
        } else {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = z7Var.f17233t;
                TLRPC.Document document = messageMedia2.document;
                tL_inputDocument.f22392id = document.f22386id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputMediaDocument.f22441id = tL_inputDocument;
                tL_inputMediaDocument.spoiler = messageMedia2.spoiler;
                inputMedia2 = tL_inputMediaDocument;
            } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                TLRPC.Photo photo = z7Var.f17233t.photo;
                tL_inputPhoto.f22399id = photo.f22404id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f22443id = tL_inputPhoto;
                inputMedia2 = tL_inputMediaPhoto;
            } else {
                inputMedia = null;
                z10 = false;
            }
            z10 = true;
            inputMedia = inputMedia2;
        }
        TLRPC.InputMedia inputMedia3 = inputMedia;
        inputMedia3 = inputMedia;
        if (inputMedia == null && inputFile != null) {
            if (z7Var.E()) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument.file = inputFile;
                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                if (z7Var.f17200c0 != null) {
                    for (int i12 = 0; i12 < z7Var.f17200c0.attributes.size(); i12++) {
                        if (z7Var.f17200c0.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                            tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) z7Var.f17200c0.attributes.get(i12);
                            break;
                        }
                    }
                } else {
                    SendMessagesHelper.fillVideoAttribute(this.f13908e, tL_documentAttributeVideo, null);
                }
                tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                tL_documentAttributeVideo.supports_streaming = true;
                int i13 = tL_documentAttributeVideo.flags;
                tL_documentAttributeVideo.flags = i13 | 4;
                tL_documentAttributeVideo.preload_prefix_size = (int) this.f13914x;
                long j10 = z7Var.f17205e0;
                if (j10 >= 0) {
                    tL_documentAttributeVideo.flags = i13 | 20;
                    tL_documentAttributeVideo.video_start_ts = ((double) (j10 - (z7Var.Z * z7Var.f17211h0))) / 1000.0d;
                }
                List list = z7Var.U0;
                if (list != null && (!list.isEmpty() || ((arrayList2 = z7Var.V0) != null && !arrayList2.isEmpty()))) {
                    tL_inputMediaUploadedDocument.flags |= 1;
                    ArrayList<TLRPC.InputDocument> arrayList4 = new ArrayList<>(z7Var.U0);
                    tL_inputMediaUploadedDocument.stickers = arrayList4;
                    ArrayList arrayList5 = z7Var.V0;
                    if (arrayList5 != null) {
                        arrayList4.addAll(arrayList5);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                }
                tL_inputMediaUploadedDocument.nosound_video = z7Var.f17242y == null && (z7Var.Y || !z7Var.K);
                tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                inputMedia3 = tL_inputMediaUploadedDocument;
            } else {
                tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                int iLastIndexOf = this.f13908e.lastIndexOf(46);
                tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(iLastIndexOf != -1 ? this.f13908e.substring(iLastIndexOf + 1).toLowerCase() : "txt");
                List list2 = z7Var.U0;
                inputMedia3 = tL_inputMediaUploadedPhoto;
                if (list2 != null && (!list2.isEmpty() || ((arrayList = z7Var.V0) != null && !arrayList.isEmpty()))) {
                    inputMedia3 = tL_inputMediaUploadedPhoto;
                    inputMedia3 = tL_inputMediaUploadedPhoto;
                    tL_inputMediaUploadedPhoto.flags |= 1;
                    ArrayList arrayList6 = z7Var.V0;
                    if (arrayList6 != null) {
                        tL_inputMediaUploadedPhoto.stickers.addAll(arrayList6);
                    }
                    tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(z7Var.U0);
                    inputMedia3 = tL_inputMediaUploadedPhoto;
                }
            }
        }
        inputMedia3 = tL_inputMediaUploadedPhoto;
        inputMedia3 = tL_inputMediaUploadedPhoto;
        inputMedia3 = tL_inputMediaUploadedPhoto;
        int i14 = UserConfig.getInstance(i11).isPremium() ? MessagesController.getInstance(i11).storyCaptionLengthLimitPremium : MessagesController.getInstance(i11).storyCaptionLengthLimitDefault;
        long j11 = this.F;
        boolean z11 = this.f13906b;
        if (z11) {
            if (z7Var.J0 != 0) {
                TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                editpreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(z7Var.J0);
                editpreviewmedia.media = z7Var.L0;
                editpreviewmedia.new_media = inputMedia3;
                editpreviewmedia.lang_code = z7Var.K0;
                tLObject = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.f22621id = z7Var.f17207f;
                tL_stories_editStory.peer = MessagesController.getInstance(i11).getInputPeer(j11);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument = z7Var.f17244z;
                if (inputDocument != null) {
                    tL_stories_editStory.music = inputDocument;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia3 != null && z7Var.f17214j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia3;
                }
                if (z7Var.f17216k && (charSequence2 = z7Var.C0) != null) {
                    tL_stories_editStory.flags |= 2;
                    CharSequence[] charSequenceArr = {charSequence2};
                    if (charSequence2.length() > i14) {
                        charSequenceArr[0] = charSequenceArr[0].subSequence(0, i14);
                    }
                    if (MessagesController.getInstance(i11).storyEntitiesAllowed()) {
                        tL_stories_editStory.entities = MediaDataController.getInstance(i11).getEntities(charSequenceArr, true);
                    } else {
                        tL_stories_editStory.entities.clear();
                    }
                    if (charSequenceArr[0].length() > i14) {
                        charSequenceArr[0] = charSequenceArr[0].subSequence(0, i14);
                    }
                    tL_stories_editStory.caption = charSequenceArr[0].toString();
                }
                if (z7Var.f17218l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList3);
                }
                ArrayList arrayList7 = z7Var.f17220m;
                if (arrayList7 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList7);
                }
                if (z7Var.T0 != null) {
                    for (int i15 = 0; i15 < z7Var.T0.size(); i15++) {
                        TL_stories.MediaArea mediaArea = ((VideoEditedInfo.MediaEntity) z7Var.T0.get(i15)).mediaArea;
                        if (mediaArea != null) {
                            tL_stories_editStory.media_areas.add(mediaArea);
                        }
                    }
                }
                if (!tL_stories_editStory.media_areas.isEmpty()) {
                    tL_stories_editStory.flags |= 8;
                }
                tLObject = tL_stories_editStory;
            }
        } else if (z7Var.J0 != 0) {
            TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
            addpreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(z7Var.J0);
            addpreviewmedia.media = inputMedia3;
            addpreviewmedia.lang_code = z7Var.K0;
            tLObject = addpreviewmedia;
        } else {
            TL_stories.TL_stories_sendStory tL_stories_sendStory = new TL_stories.TL_stories_sendStory();
            boolean z12 = z10;
            tL_stories_sendStory.random_id = this.f13905a;
            tL_stories_sendStory.peer = MessagesController.getInstance(i11).getInputPeer(j11);
            tL_stories_sendStory.media = inputMedia3;
            tL_stories_sendStory.privacy_rules.addAll(arrayList3);
            tL_stories_sendStory.pinned = z7Var.G0;
            tL_stories_sendStory.noforwards = !z7Var.H0;
            tL_stories_sendStory.albums = z7Var.f17239w0 != null ? new ArrayList<>(z7Var.f17239w0) : null;
            TLRPC.InputDocument inputDocument2 = z7Var.f17244z;
            if (inputDocument2 != null) {
                tL_stories_sendStory.flags |= 512;
                tL_stories_sendStory.music = inputDocument2;
            }
            CharSequence charSequence3 = z7Var.C0;
            if (charSequence3 != null) {
                tL_stories_sendStory.flags |= 3;
                CharSequence[] charSequenceArr2 = {charSequence3};
                if (charSequence3.length() > i14) {
                    charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i14);
                }
                if (MessagesController.getInstance(i11).storyEntitiesAllowed()) {
                    tL_stories_sendStory.entities = MediaDataController.getInstance(i11).getEntities(charSequenceArr2, true);
                } else {
                    tL_stories_sendStory.entities.clear();
                }
                i10 = 0;
                if (charSequenceArr2[0].length() > i14) {
                    charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i14);
                }
                tL_stories_sendStory.caption = charSequenceArr2[0].toString();
            } else {
                i10 = 0;
            }
            if (z7Var.f17221n) {
                tL_stories_sendStory.flags |= 64;
                tL_stories_sendStory.fwd_from_id = MessagesController.getInstance(i11).getInputPeer(z7Var.f17227q);
                tL_stories_sendStory.fwd_from_story = z7Var.f17229r;
                tL_stories_sendStory.fwd_modified = !z12;
            }
            int i16 = z7Var.I0;
            if (i16 == Integer.MAX_VALUE) {
                tL_stories_sendStory.pinned = true;
            } else {
                tL_stories_sendStory.flags |= 8;
                tL_stories_sendStory.period = i16;
            }
            if (z7Var.T0 != null) {
                while (i10 < z7Var.T0.size()) {
                    TL_stories.MediaArea mediaArea2 = ((VideoEditedInfo.MediaEntity) z7Var.T0.get(i10)).mediaArea;
                    if (mediaArea2 != null) {
                        tL_stories_sendStory.media_areas.add(mediaArea2);
                    }
                    i10++;
                }
                if (!tL_stories_sendStory.media_areas.isEmpty()) {
                    tL_stories_sendStory.flags |= 32;
                }
            }
            tLObject = tL_stories_sendStory;
        }
        n6 n6Var = new n6(this, 0);
        if (!BuildVars.DEBUG_PRIVATE_VERSION || z11 || (charSequence = z7Var.C0) == null || !charSequence.toString().contains("#failtest") || this.D) {
            this.f13913w = ConnectionsManager.getInstance(i11).sendRequest(tLObject, n6Var, 64);
            return;
        }
        TLRPC.TL_error tL_error = new TLRPC.TL_error();
        tL_error.code = 400;
        tL_error.text = "FORCED_TO_FAIL";
        n6Var.run(null, tL_error);
    }

    public final void d() {
        lh.z7 z7Var = this.f13907c;
        if (z7Var.f17197b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f13907c.f17200c0);
            c(tL_inputFileStoryDocument);
        } else if ((z7Var.f17209g || (z7Var.f17221n && z7Var.f17233t != null)) && !z7Var.f17214j && z7Var.f17224o0 == null) {
            c(null);
            return;
        }
        lh.o9 o9Var = this.f13907c.E0;
        this.C = o9Var != null && o9Var.f16489a == 1;
        NotificationCenter.getInstance(this.I.f13955a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.I.f13955a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.I.f13955a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.I.f13955a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.I.f13955a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.I.f13955a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean zE = this.f13907c.E();
        this.f13912s = zE;
        if (zE) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f22401id = 1;
            String absolutePath = lh.z7.x(this.I.f13955a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f13908e = absolutePath;
            this.A = new MessageObject(this.I.f13955a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f13907c.s(new q6(this, 1));
        } else {
            File fileW = lh.z7.w(this.I.f13955a, "jpg");
            this.f13908e = fileW.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new p6(2, this, fileW));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) StoryUploadingService.class);
        intent.putExtra("path", this.f13908e);
        intent.putExtra("currentAccount", this.I.f13955a);
        try {
            ApplicationLoader.applicationContext.startService(intent);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            if (objArr[0] == this.A) {
                this.f13908e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.fileNewChunkAvailable;
        s6 s6Var = this.I;
        if (i10 == i12) {
            if (objArr[0] == this.A) {
                String str = (String) objArr[1];
                long jLongValue = ((Long) objArr[2]).longValue();
                long jLongValue2 = ((Long) objArr[3]).longValue();
                float fFloatValue = ((Float) objArr[4]).floatValue();
                this.f13910n = fFloatValue;
                this.h = (this.f13911r * 0.7f) + (fFloatValue * 0.3f);
                NotificationCenter.getInstance(s6Var.f13955a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f13908e, Float.valueOf(this.h));
                if (this.f13914x < 0 && this.f13910n * this.f13915y >= 1000.0f) {
                    this.f13914x = jLongValue;
                }
                FileLoader.getInstance(s6Var.f13955a).checkUploadNewDataAvailable(str, false, Math.max(1L, jLongValue), jLongValue2, Float.valueOf(this.f13910n));
                if (jLongValue2 <= 0 || this.f13914x >= 0) {
                    return;
                }
                this.f13914x = jLongValue2;
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.A) {
                if (!this.f13906b) {
                    lh.z7 z7Var = this.f13907c;
                    z7Var.f17238w = true;
                    z7Var.f17240x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = z7Var.f17240x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.E = true;
                    this.D = true;
                    s6Var.f13974w.d(z7Var);
                }
                b();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploaded) {
            String str2 = (String) objArr[0];
            String str3 = this.f13908e;
            if (str3 == null || !str2.equals(str3)) {
                return;
            }
            c((TLRPC.InputFile) objArr[1]);
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.f13908e;
            if (str5 == null || !str4.equals(str5)) {
                return;
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
            b();
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.f13908e)) {
            float fMin = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            this.f13911r = fMin;
            this.h = (fMin * 0.7f) + (this.f13910n * 0.3f);
            NotificationCenter.getInstance(s6Var.f13955a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f13908e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        lh.z7 z7Var = this.f13907c;
        z7Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.I.f13955a);
        String str = this.f13908e;
        boolean z10 = !z7Var.K;
        long jMax = 0;
        if (this.f13912s) {
            VideoEditedInfo videoEditedInfo = this.B;
            jMax = Math.max(1, (int) (videoEditedInfo != null ? videoEditedInfo.estimatedSize : 0L));
        }
        fileLoader.uploadFile(str, false, z10, jMax, z7Var.K ? 33554432 : 16777216, true);
    }
}
