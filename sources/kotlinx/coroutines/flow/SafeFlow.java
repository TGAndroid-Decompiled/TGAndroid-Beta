package kotlinx.coroutines.flow;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.Editable;
import android.util.Log;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.android.billingclient.api.zzcm;
import com.android.billingclient.api.zzcs;
import com.google.android.gms.dynamite.zzk;
import com.google.android.gms.internal.mlkit_vision_common.zzia;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.detector.AlignmentPattern;
import com.google.zxing.qrcode.detector.AlignmentPatternFinder;
import com.google.zxing.qrcode.detector.FinderPattern;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import me.vkryl.android.animator.BoolAnimator;
import org.commonmark.internal.ParagraphParser;
import org.commonmark.parser.block.AbstractBlockParser;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda153;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.community.CommunityPendingRequestsActivity;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda2;
import org.telegram.ui.iv.RichQuoteAuthorCell;

public final class SafeFlow implements ObjectConstructor, Flow, OnCompleteListener, CropView.CropViewListener, CommunityUtils.PendingRequests.Delegate, RichEditText.Listener {
    public final Object block;

    public SafeFlow(Object obj) {
        this.block = obj;
    }

    public float calculateModuleSizeOneWay(FinderPattern finderPattern, FinderPattern finderPattern2) {
        int i = (int) finderPattern.x;
        int i2 = (int) finderPattern.y;
        int i3 = (int) finderPattern2.x;
        int i4 = (int) finderPattern2.y;
        float fSizeOfBlackWhiteBlackRunBothWays = sizeOfBlackWhiteBlackRunBothWays(i, i2, i3, i4);
        float fSizeOfBlackWhiteBlackRunBothWays2 = sizeOfBlackWhiteBlackRunBothWays((int) finderPattern2.x, i4, (int) finderPattern.x, i2);
        if (Float.isNaN(fSizeOfBlackWhiteBlackRunBothWays)) {
            return fSizeOfBlackWhiteBlackRunBothWays2 / 7.0f;
        }
        return Float.isNaN(fSizeOfBlackWhiteBlackRunBothWays2) ? fSizeOfBlackWhiteBlackRunBothWays / 7.0f : (fSizeOfBlackWhiteBlackRunBothWays + fSizeOfBlackWhiteBlackRunBothWays2) / 14.0f;
    }

    @Override
    public void close() {
        ((CommunityPendingRequestsActivity) this.block).finishFragment();
    }

    @Override
    public Object collect(FlowCollector flowCollector, ContinuationImpl continuationImpl) throws Throwable {
        AbstractFlow$collect$1 abstractFlow$collect$1;
        Throwable th;
        SafeCollector safeCollector;
        if (continuationImpl instanceof AbstractFlow$collect$1) {
            abstractFlow$collect$1 = (AbstractFlow$collect$1) continuationImpl;
            int i = abstractFlow$collect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                abstractFlow$collect$1.label = i - Integer.MIN_VALUE;
            } else {
                abstractFlow$collect$1 = new AbstractFlow$collect$1(this, continuationImpl);
            }
        } else {
            abstractFlow$collect$1 = new AbstractFlow$collect$1(this, continuationImpl);
        }
        Object obj = abstractFlow$collect$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = abstractFlow$collect$1.label;
        Unit unit = Unit.INSTANCE;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector = abstractFlow$collect$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                safeCollector.releaseIntercepted();
                return unit;
            } catch (Throwable th2) {
                th = th2;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        SafeCollector safeCollector2 = new SafeCollector(flowCollector, abstractFlow$collect$1.getContext());
        try {
            abstractFlow$collect$1.L$0 = safeCollector2;
            abstractFlow$collect$1.label = 1;
            Object objInvoke = ((SingleProcessDataStore$data$1) this.block).invoke(safeCollector2, abstractFlow$collect$1);
            if (objInvoke != coroutineSingletons) {
                objInvoke = unit;
            }
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            return unit;
        } catch (Throwable th3) {
            th = th3;
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            throw th;
        }
    }

    @Override
    public Object construct() {
        Constructor constructor = (Constructor) this.block;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            zzia zziaVar = ReflectionHelper.RECORD_HELPER;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e3.getCause());
        }
    }

    public synchronized void deleteAll() {
        ((SharedPreferences) this.block).edit().clear().commit();
    }

    public AlignmentPattern findAlignmentInRegion(float f, float f2, int i, int i2) throws NotFoundException {
        BitMatrix bitMatrix;
        AlignmentPattern alignmentPatternHandlePossibleCenter;
        AlignmentPattern alignmentPatternHandlePossibleCenter2;
        int i3 = (int) (f2 * f);
        int iMax = Math.max(0, i - i3);
        BitMatrix bitMatrix2 = (BitMatrix) this.block;
        int iMin = Math.min(bitMatrix2.width - 1, i + i3) - iMax;
        float f3 = 3.0f * f;
        if (iMin < f3) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i2 - i3);
        int iMin2 = Math.min(bitMatrix2.height - 1, i2 + i3) - iMax2;
        if (iMin2 < f3) {
            throw NotFoundException.getNotFoundInstance();
        }
        AlignmentPatternFinder alignmentPatternFinder = new AlignmentPatternFinder((BitMatrix) this.block, iMax, iMax2, iMin, iMin2, f);
        int i4 = alignmentPatternFinder.width;
        int i5 = alignmentPatternFinder.startX;
        int i6 = i4 + i5;
        int i7 = alignmentPatternFinder.height;
        int i8 = (i7 / 2) + alignmentPatternFinder.startY;
        int[] iArr = new int[3];
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = ((i9 & 1) == 0 ? (i9 + 1) / 2 : -((i9 + 1) / 2)) + i8;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i11 = i5;
            while (true) {
                bitMatrix = alignmentPatternFinder.image;
                if (i11 >= i6 || bitMatrix.get(i11, i10)) {
                    break;
                }
                i11++;
            }
            int i12 = 0;
            while (i11 < i6) {
                if (!bitMatrix.get(i11, i10)) {
                    if (i12 == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i12 != 2) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else {
                    if (alignmentPatternFinder.foundPatternCross(iArr) && (alignmentPatternHandlePossibleCenter2 = alignmentPatternFinder.handlePossibleCenter(i10, i11, iArr)) != null) {
                        return alignmentPatternHandlePossibleCenter2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i12 = 1;
                }
                i11++;
            }
            if (alignmentPatternFinder.foundPatternCross(iArr) && (alignmentPatternHandlePossibleCenter = alignmentPatternFinder.handlePossibleCenter(i10, i6, iArr)) != null) {
                return alignmentPatternHandlePossibleCenter;
            }
        }
        ArrayList arrayList = alignmentPatternFinder.possibleCenters;
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (AlignmentPattern) arrayList.get(0);
    }

    public StringBuilder getParagraphContent() {
        AbstractBlockParser abstractBlockParser = (AbstractBlockParser) this.block;
        if (!(abstractBlockParser instanceof ParagraphParser)) {
            return null;
        }
        StringBuilder sb = ((ParagraphParser) abstractBlockParser).linkReferenceDefinitionParser.paragraph;
        if (sb.length() == 0) {
            return null;
        }
        return sb;
    }

    @Override
    public boolean onBackspaceAtStart(RichEditText richEditText) {
        return false;
    }

    @Override
    public void onBackspaceOnEmpty() {
    }

    @Override
    public void onClickGroupOwner(long j) {
        ((CommunityPendingRequestsActivity) this.block).presentFragment(ChatActivity.of(j));
    }

    @Override
    public void onComplete(Task task) throws IllegalAccessException, InvocationTargetException {
        Exception exception = task.getException();
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.block;
        if (exception != null) {
            cancellableContinuationImpl.resumeWith(ResultKt.createFailure(exception));
        } else if (task.isCanceled()) {
            cancellableContinuationImpl.cancel(null);
        } else {
            cancellableContinuationImpl.resumeWith(task.getResult());
        }
    }

    @Override
    public void onEnterPressed(RichEditText richEditText) {
        BlockRow blockRow;
        ArrayList arrayList;
        RichQuoteAuthorCell richQuoteAuthorCell = (RichQuoteAuthorCell) this.block;
        RichQuoteAuthorCell.Delegate delegate = richQuoteAuthorCell.delegate;
        if (delegate == null || (blockRow = richQuoteAuthorCell.currentRow) == null) {
            return;
        }
        RichEditorListView richEditorListView = RichEditorListView.this;
        richEditorListView.getClass();
        long j = blockRow.authorQuoteId;
        if (j == 0) {
            return;
        }
        int i = -1;
        int i2 = 0;
        while (true) {
            arrayList = richEditorListView.rows;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (((BlockRow) arrayList.get(i2)).quoteIds.contains(Long.valueOf(j))) {
                i = i2;
            }
            i2++;
        }
        if (i < 0) {
            return;
        }
        RichEditorHistory richEditorHistory = richEditorListView.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = blockRow2.quoteIds;
        arrayList2.addAll(blockRow.quoteIds);
        if (!arrayList2.isEmpty()) {
            Fragment$$ExternalSyntheticOutline0.m81m(1, arrayList2);
        }
        arrayList.add(i + 1, blockRow2);
        richEditorListView.renumberAllRuns();
        richEditorListView.adapter.update(false);
        RichEditorHistory richEditorHistory2 = richEditorListView.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        richEditorListView.post(new RichEditorListView$$ExternalSyntheticLambda2(richEditorListView, blockRow2, 26));
    }

    @Override
    public void onLockedInsert(CharSequence charSequence) {
    }

    @Override
    public boolean onPaste(RichEditText richEditText) {
        return false;
    }

    @Override
    public void onRequestWindowFocusable(RichEditText richEditText) {
        RichQuoteAuthorCell.Delegate delegate = ((RichQuoteAuthorCell) this.block).delegate;
        if (delegate != null) {
            RichEditorListView richEditorListView = RichEditorListView.this;
            richEditorListView.prepareEditText(richEditText);
            richEditorListView.delegate.makeEditTextFocusable(richEditText);
        }
    }

    @Override
    public boolean onSelectAll() {
        return false;
    }

    @Override
    public void onSelectionChanged(RichEditText richEditText, int i, int i2) {
        RichQuoteAuthorCell.Delegate delegate;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
        RichQuoteAuthorCell richQuoteAuthorCell = (RichQuoteAuthorCell) this.block;
        if (richQuoteAuthorCell.hijackingSelection || i == i2 || (delegate = richQuoteAuthorCell.delegate) == null || (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) == null) {
            return;
        }
        richEditText.post(new ChatActivity$$ExternalSyntheticLambda153(this, richEditText, i2, textSelectionHelper, i, 5));
    }

    @Override
    public void onTab(boolean z) {
    }

    @Override
    public void onTextChanged(Editable editable) {
        ((RichQuoteAuthorCell) this.block).persist();
    }

    @Override
    public void onTextWillChange(int i, int i2) {
    }

    @Override
    public void onUpdate() {
        ((StoryRecorder.AnonymousClass36) this.block).contentView.invalidate();
    }

    public Settings parseSettingsJson(JSONObject jSONObject) {
        SettingsJsonTransform zzcsVar;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            zzcsVar = new zzcm();
        } else {
            zzcsVar = new zzcs(15);
        }
        return zzcsVar.buildFromJson((zzk) this.block, jSONObject);
    }

    public float sizeOfBlackWhiteBlackRun(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int iAbs = Math.abs(i7 - i5);
        int iAbs2 = Math.abs(i8 - i6);
        int i10 = (-iAbs) / 2;
        int i11 = i5 < i7 ? 1 : -1;
        int i12 = i6 < i8 ? 1 : -1;
        int i13 = i7 + i11;
        int i14 = i5;
        int i15 = i6;
        int i16 = 0;
        while (i14 != i13) {
            boolean z2 = z;
            int i17 = iAbs;
            if ((i16 == i9) == ((BitMatrix) this.block).get(z ? i15 : i14, z ? i14 : i15)) {
                if (i16 == 2) {
                    return MathUtils.distance(i14, i15, i5, i6);
                }
                i16++;
            }
            i10 += iAbs2;
            if (i10 > 0) {
                if (i15 == i8) {
                    break;
                }
                i15 += i12;
                i10 -= i17;
            }
            i14 += i11;
            iAbs = i17;
            z = z2;
            i9 = 1;
        }
        if (i16 == 2) {
            return MathUtils.distance(i13, i8, i5, i6);
        }
        return Float.NaN;
    }

    public float sizeOfBlackWhiteBlackRunBothWays(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float fSizeOfBlackWhiteBlackRun = sizeOfBlackWhiteBlackRun(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        BitMatrix bitMatrix = (BitMatrix) this.block;
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = bitMatrix.width;
            if (i5 >= i7) {
                float f3 = ((i7 - 1) - i) / (i5 - i);
                int i8 = i7 - 1;
                f = f3;
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f4 = i2;
        int i9 = (int) (f4 - ((i4 - i2) * f));
        if (i9 < 0) {
            f2 = f4 / (i2 - i9);
        } else {
            int i10 = bitMatrix.height;
            if (i9 >= i10) {
                f2 = ((i10 - 1) - i2) / (i9 - i2);
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (sizeOfBlackWhiteBlackRun(i, i2, (int) (((i5 - i) * f2) + i), i6) + fSizeOfBlackWhiteBlackRun) - 1.0f;
    }

    @Override
    public void updateAdapter() {
        CommunityPendingRequestsActivity communityPendingRequestsActivity = (CommunityPendingRequestsActivity) this.block;
        BoolAnimator boolAnimator = communityPendingRequestsActivity.animatorIsRequestsEmpty;
        CommunityUtils.PendingRequests pendingRequests = communityPendingRequestsActivity.pendingRequestsList;
        boolAnimator.setValue(pendingRequests.finished && pendingRequests.totalCount == 0, true);
        communityPendingRequestsActivity.listView.adapter.update(true);
    }

    public SafeFlow() {
        this.block = new float[8];
    }

    public SafeFlow(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.block = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                deleteAll();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    @Override
    public void onTapUp() {
    }

    @Override
    public void onAspectLock(boolean z) {
    }

    @Override
    public void onChange(boolean z) {
    }
}
