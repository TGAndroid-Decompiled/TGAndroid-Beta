package org.scilab.forge.jlatexmath;
class PredefMacroInfo extends MacroInfo {
    private int f18029id;

    public PredefMacroInfo(int i10, int i11, int i12) {
        super(i11, i12);
        this.f18029id = i10;
    }

    private static final Object invokeID(int i10, TeXParser teXParser, String[] strArr) {
        try {
            switch (i10) {
                case 0:
                    return PredefMacros.newcommand_macro(teXParser, strArr);
                case 1:
                    return PredefMacros.renewcommand_macro(teXParser, strArr);
                case 2:
                    return PredefMacros.rule_macro(teXParser, strArr);
                case 3:
                case 4:
                    return PredefMacros.hvspace_macro(teXParser, strArr);
                case 5:
                case 6:
                case 7:
                    return PredefMacros.clrlap_macro(teXParser, strArr);
                case 8:
                case 9:
                case 10:
                    return PredefMacros.mathclrlap_macro(teXParser, strArr);
                case 11:
                    return PredefMacros.includegraphics_macro(teXParser, strArr);
                case 12:
                    return PredefMacros.cfrac_macro(teXParser, strArr);
                case 13:
                    return PredefMacros.frac_macro(teXParser, strArr);
                case 14:
                    return PredefMacros.sfrac_macro(teXParser, strArr);
                case 15:
                    return PredefMacros.genfrac_macro(teXParser, strArr);
                case 16:
                    return PredefMacros.over_macro(teXParser, strArr);
                case 17:
                    return PredefMacros.overwithdelims_macro(teXParser, strArr);
                case 18:
                    return PredefMacros.atop_macro(teXParser, strArr);
                case 19:
                    return PredefMacros.atopwithdelims_macro(teXParser, strArr);
                case 20:
                    return PredefMacros.choose_macro(teXParser, strArr);
                case 21:
                    return PredefMacros.underscore_macro(teXParser, strArr);
                case 22:
                    return PredefMacros.mbox_macro(teXParser, strArr);
                case 23:
                    return PredefMacros.text_macro(teXParser, strArr);
                case 24:
                    return PredefMacros.intertext_macro(teXParser, strArr);
                case 25:
                    return PredefMacros.binom_macro(teXParser, strArr);
                case 26:
                    return PredefMacros.mathbf_macro(teXParser, strArr);
                case 27:
                    return PredefMacros.bf_macro(teXParser, strArr);
                case 28:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 29:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 30:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 31:
                    return PredefMacros.mathit_macro(teXParser, strArr);
                case 32:
                    return PredefMacros.it_macro(teXParser, strArr);
                case 33:
                    return PredefMacros.mathrm_macro(teXParser, strArr);
                case 34:
                    return PredefMacros.rm_macro(teXParser, strArr);
                case 35:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 36:
                    return PredefMacros.mathsf_macro(teXParser, strArr);
                case 37:
                    return PredefMacros.sf_macro(teXParser, strArr);
                case 38:
                    return PredefMacros.mathtt_macro(teXParser, strArr);
                case 39:
                    return PredefMacros.tt_macro(teXParser, strArr);
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case 58:
                    return PredefMacros.T_macro(teXParser, strArr);
                case 59:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case 60:
                    return PredefMacros.accent_macro(teXParser, strArr);
                case 61:
                    return PredefMacros.grkaccent_macro(teXParser, strArr);
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                    return PredefMacros.accent_macros(teXParser, strArr);
                case 76:
                    return PredefMacros.nbsp_macro(teXParser, strArr);
                case 77:
                    return PredefMacros.smallmatrixATATenv_macro(teXParser, strArr);
                case 78:
                    return PredefMacros.matrixATATenv_macro(teXParser, strArr);
                case 79:
                    return PredefMacros.overrightarrow_macro(teXParser, strArr);
                case 80:
                    return PredefMacros.overleftarrow_macro(teXParser, strArr);
                case 81:
                    return PredefMacros.overleftrightarrow_macro(teXParser, strArr);
                case 82:
                    return PredefMacros.underrightarrow_macro(teXParser, strArr);
                case 83:
                    return PredefMacros.underleftarrow_macro(teXParser, strArr);
                case 84:
                    return PredefMacros.underleftrightarrow_macro(teXParser, strArr);
                case 85:
                    return PredefMacros.xleftarrow_macro(teXParser, strArr);
                case 86:
                    return PredefMacros.xrightarrow_macro(teXParser, strArr);
                case 87:
                    return PredefMacros.underbrace_macro(teXParser, strArr);
                case 88:
                    return PredefMacros.overbrace_macro(teXParser, strArr);
                case 89:
                    return PredefMacros.underbrack_macro(teXParser, strArr);
                case 90:
                    return PredefMacros.overbrack_macro(teXParser, strArr);
                case 91:
                    return PredefMacros.underparen_macro(teXParser, strArr);
                case 92:
                    return PredefMacros.overparen_macro(teXParser, strArr);
                case 93:
                case 94:
                    return PredefMacros.sqrt_macro(teXParser, strArr);
                case 95:
                    return PredefMacros.overline_macro(teXParser, strArr);
                case 96:
                    return PredefMacros.underline_macro(teXParser, strArr);
                case 97:
                    return PredefMacros.mathop_macro(teXParser, strArr);
                case 98:
                    return PredefMacros.mathpunct_macro(teXParser, strArr);
                case 99:
                    return PredefMacros.mathord_macro(teXParser, strArr);
                case 100:
                    return PredefMacros.mathrel_macro(teXParser, strArr);
                case 101:
                    return PredefMacros.mathinner_macro(teXParser, strArr);
                case 102:
                    return PredefMacros.mathbin_macro(teXParser, strArr);
                case 103:
                    return PredefMacros.mathopen_macro(teXParser, strArr);
                case 104:
                    return PredefMacros.mathclose_macro(teXParser, strArr);
                case 105:
                    return PredefMacros.joinrel_macro(teXParser, strArr);
                case 106:
                    return PredefMacros.smash_macro(teXParser, strArr);
                case 107:
                    return PredefMacros.vdots_macro(teXParser, strArr);
                case 108:
                    return PredefMacros.ddots_macro(teXParser, strArr);
                case 109:
                    return PredefMacros.iddots_macro(teXParser, strArr);
                case 110:
                    return PredefMacros.nolimits_macro(teXParser, strArr);
                case 111:
                    return PredefMacros.limits_macro(teXParser, strArr);
                case 112:
                    return PredefMacros.normal_macro(teXParser, strArr);
                case 113:
                    return PredefMacros.leftparenthesis_macro(teXParser, strArr);
                case 114:
                    return PredefMacros.leftbracket_macro(teXParser, strArr);
                case 115:
                    return PredefMacros.left_macro(teXParser, strArr);
                case 116:
                    return PredefMacros.middle_macro(teXParser, strArr);
                case 117:
                    return PredefMacros.cr_macro(teXParser, strArr);
                case 118:
                    return PredefMacros.multicolumn_macro(teXParser, strArr);
                case 119:
                    return PredefMacros.hdotsfor_macro(teXParser, strArr);
                case 120:
                    return PredefMacros.arrayATATenv_macro(teXParser, strArr);
                case 121:
                    return PredefMacros.alignATATenv_macro(teXParser, strArr);
                case 122:
                    return PredefMacros.alignedATATenv_macro(teXParser, strArr);
                case 123:
                    return PredefMacros.flalignATATenv_macro(teXParser, strArr);
                case 124:
                    return PredefMacros.alignatATATenv_macro(teXParser, strArr);
                case 125:
                    return PredefMacros.alignedatATATenv_macro(teXParser, strArr);
                case 126:
                    return PredefMacros.multlineATATenv_macro(teXParser, strArr);
                case 127:
                    return PredefMacros.gatherATATenv_macro(teXParser, strArr);
                case 128:
                    return PredefMacros.gatheredATATenv_macro(teXParser, strArr);
                case 129:
                    return PredefMacros.shoveright_macro(teXParser, strArr);
                case 130:
                    return PredefMacros.shoveleft_macro(teXParser, strArr);
                case 131:
                    return PredefMacros.backslashcr_macro(teXParser, strArr);
                case 132:
                    return PredefMacros.newenvironment_macro(teXParser, strArr);
                case 133:
                    return PredefMacros.renewenvironment_macro(teXParser, strArr);
                case 134:
                    return PredefMacros.makeatletter_macro(teXParser, strArr);
                case 135:
                    return PredefMacros.makeatother_macro(teXParser, strArr);
                case 136:
                case 137:
                    return PredefMacros.fbox_macro(teXParser, strArr);
                case 138:
                    return PredefMacros.stackrel_macro(teXParser, strArr);
                case 139:
                    return PredefMacros.stackbin_macro(teXParser, strArr);
                case 140:
                    return PredefMacros.accentset_macro(teXParser, strArr);
                case 141:
                    return PredefMacros.underaccent_macro(teXParser, strArr);
                case 142:
                    return PredefMacros.undertilde_macro(teXParser, strArr);
                case 143:
                    return PredefMacros.overset_macro(teXParser, strArr);
                case 144:
                    return PredefMacros.Braket_macro(teXParser, strArr);
                case 145:
                    return PredefMacros.Set_macro(teXParser, strArr);
                case 146:
                    return PredefMacros.underset_macro(teXParser, strArr);
                case 147:
                    return PredefMacros.boldsymbol_macro(teXParser, strArr);
                case 148:
                    return PredefMacros.LaTeX_macro(teXParser, strArr);
                case 149:
                    return PredefMacros.GeoGebra_macro(teXParser, strArr);
                case 150:
                    return PredefMacros.big_macro(teXParser, strArr);
                case 151:
                    return PredefMacros.Big_macro(teXParser, strArr);
                case 152:
                    return PredefMacros.bigg_macro(teXParser, strArr);
                case 153:
                    return PredefMacros.Bigg_macro(teXParser, strArr);
                case 154:
                    return PredefMacros.bigl_macro(teXParser, strArr);
                case 155:
                    return PredefMacros.Bigl_macro(teXParser, strArr);
                case 156:
                    return PredefMacros.biggl_macro(teXParser, strArr);
                case 157:
                    return PredefMacros.Biggl_macro(teXParser, strArr);
                case 158:
                    return PredefMacros.bigr_macro(teXParser, strArr);
                case 159:
                    return PredefMacros.Bigr_macro(teXParser, strArr);
                case 160:
                    return PredefMacros.biggr_macro(teXParser, strArr);
                case 161:
                    return PredefMacros.Biggr_macro(teXParser, strArr);
                case 162:
                    return PredefMacros.displaystyle_macro(teXParser, strArr);
                case 163:
                    return PredefMacros.textstyle_macro(teXParser, strArr);
                case 164:
                    return PredefMacros.scriptstyle_macro(teXParser, strArr);
                case 165:
                    return PredefMacros.scriptscriptstyle_macro(teXParser, strArr);
                case 166:
                    return PredefMacros.sideset_macro(teXParser, strArr);
                case 167:
                    return PredefMacros.prescript_macro(teXParser, strArr);
                case 168:
                    return PredefMacros.rotatebox_macro(teXParser, strArr);
                case 169:
                    return PredefMacros.reflectbox_macro(teXParser, strArr);
                case 170:
                    return PredefMacros.scalebox_macro(teXParser, strArr);
                case 171:
                    return PredefMacros.resizebox_macro(teXParser, strArr);
                case 172:
                    return PredefMacros.raisebox_macro(teXParser, strArr);
                case 173:
                    return PredefMacros.shadowbox_macro(teXParser, strArr);
                case 174:
                    return PredefMacros.ovalbox_macro(teXParser, strArr);
                case 175:
                    return PredefMacros.doublebox_macro(teXParser, strArr);
                case 176:
                    return PredefMacros.phantom_macro(teXParser, strArr);
                case 177:
                    return PredefMacros.hphantom_macro(teXParser, strArr);
                case 178:
                    return PredefMacros.vphantom_macro(teXParser, strArr);
                case 179:
                    return PredefMacros.spATbreve_macro(teXParser, strArr);
                case 180:
                    return PredefMacros.spAThat_macro(teXParser, strArr);
                case 181:
                    return PredefMacros.definecolor_macro(teXParser, strArr);
                case 182:
                    return PredefMacros.textcolor_macro(teXParser, strArr);
                case 183:
                    return PredefMacros.fgcolor_macro(teXParser, strArr);
                case 184:
                    return PredefMacros.bgcolor_macro(teXParser, strArr);
                case 185:
                    return PredefMacros.colorbox_macro(teXParser, strArr);
                case 186:
                    return PredefMacros.fcolorbox_macro(teXParser, strArr);
                case 187:
                    return PredefMacros.cedilla_macro(teXParser, strArr);
                case 188:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case 189:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case 190:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case 191:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case 192:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case 193:
                    return PredefMacros.tcaron_macro(teXParser, strArr);
                case 194:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case 195:
                    return PredefMacros.ogonek_macro(teXParser, strArr);
                case 196:
                    return PredefMacros.cong_macro(teXParser, strArr);
                case 197:
                    return PredefMacros.doteq_macro(teXParser, strArr);
                case 198:
                    return PredefMacros.jlmDynamic_macro(teXParser, strArr);
                case 199:
                    return PredefMacros.jlmExternalFont_macro(teXParser, strArr);
                case 200:
                    return PredefMacros.jlmText_macro(teXParser, strArr);
                case 201:
                    return PredefMacros.jlmTextit_macro(teXParser, strArr);
                case 202:
                    return PredefMacros.jlmTextbf_macro(teXParser, strArr);
                case 203:
                    return PredefMacros.jlmTextitbf_macro(teXParser, strArr);
                case 204:
                    return PredefMacros.DeclareMathSizes_macro(teXParser, strArr);
                case 205:
                    return PredefMacros.magnification_macro(teXParser, strArr);
                case 206:
                    return PredefMacros.hline_macro(teXParser, strArr);
                case 207:
                case 208:
                case 209:
                case 210:
                case 211:
                case 212:
                case 213:
                case 214:
                case 215:
                case 216:
                    return PredefMacros.size_macros(teXParser, strArr);
                case 217:
                    return PredefMacros.jlatexmathcumsup_macro(teXParser, strArr);
                case 218:
                    return PredefMacros.jlatexmathcumsub_macro(teXParser, strArr);
                case 219:
                    return PredefMacros.hstrok_macro(teXParser, strArr);
                case 220:
                    return PredefMacros.Hstrok_macro(teXParser, strArr);
                case 221:
                    return PredefMacros.dstrok_macro(teXParser, strArr);
                case 222:
                    return PredefMacros.Dstrok_macro(teXParser, strArr);
                case 223:
                    return PredefMacros.dotminus_macro(teXParser, strArr);
                case 224:
                    return PredefMacros.ratio_macro(teXParser, strArr);
                case 225:
                    return PredefMacros.smallfrowneq_macro(teXParser, strArr);
                case 226:
                    return PredefMacros.geoprop_macro(teXParser, strArr);
                case 227:
                    return PredefMacros.minuscolon_macro(teXParser, strArr);
                case 228:
                    return PredefMacros.minuscoloncolon_macro(teXParser, strArr);
                case 229:
                    return PredefMacros.simcolon_macro(teXParser, strArr);
                case 230:
                    return PredefMacros.simcoloncolon_macro(teXParser, strArr);
                case 231:
                    return PredefMacros.approxcolon_macro(teXParser, strArr);
                case 232:
                    return PredefMacros.approxcoloncolon_macro(teXParser, strArr);
                case 233:
                    return PredefMacros.coloncolon_macro(teXParser, strArr);
                case 234:
                    return PredefMacros.equalscolon_macro(teXParser, strArr);
                case 235:
                    return PredefMacros.equalscoloncolon_macro(teXParser, strArr);
                case 236:
                    return PredefMacros.colonminus_macro(teXParser, strArr);
                case 237:
                    return PredefMacros.coloncolonminus_macro(teXParser, strArr);
                case 238:
                    return PredefMacros.colonequals_macro(teXParser, strArr);
                case 239:
                    return PredefMacros.coloncolonequals_macro(teXParser, strArr);
                case 240:
                    return PredefMacros.colonsim_macro(teXParser, strArr);
                case 241:
                    return PredefMacros.coloncolonsim_macro(teXParser, strArr);
                case 242:
                    return PredefMacros.colonapprox_macro(teXParser, strArr);
                case 243:
                    return PredefMacros.coloncolonapprox_macro(teXParser, strArr);
                case 244:
                    return PredefMacros.kern_macro(teXParser, strArr);
                case 245:
                    return PredefMacros.char_macro(teXParser, strArr);
                case 246:
                case 247:
                    return PredefMacros.romannumeral_macro(teXParser, strArr);
                case 248:
                    return PredefMacros.textcircled_macro(teXParser, strArr);
                case 249:
                    return PredefMacros.textsc_macro(teXParser, strArr);
                case 250:
                    return PredefMacros.sc_macro(teXParser, strArr);
                case 251:
                case 252:
                case 253:
                case 254:
                case 255:
                case 256:
                case 257:
                case 258:
                case 259:
                case 260:
                    return PredefMacros.muskip_macros(teXParser, strArr);
                case 261:
                    return PredefMacros.quad_macro(teXParser, strArr);
                case 262:
                    return PredefMacros.surd_macro(teXParser, strArr);
                case 263:
                    return PredefMacros.iint_macro(teXParser, strArr);
                case 264:
                    return PredefMacros.iiint_macro(teXParser, strArr);
                case 265:
                    return PredefMacros.iiiint_macro(teXParser, strArr);
                case 266:
                    return PredefMacros.idotsint_macro(teXParser, strArr);
                case 267:
                    return PredefMacros.int_macro(teXParser, strArr);
                case 268:
                    return PredefMacros.oint_macro(teXParser, strArr);
                case 269:
                    return PredefMacros.lmoustache_macro(teXParser, strArr);
                case 270:
                    return PredefMacros.rmoustache_macro(teXParser, strArr);
                case 271:
                    return PredefMacros.insertBreakMark_macro(teXParser, strArr);
                case 272:
                    return PredefMacros.jlmXML_macro(teXParser, strArr);
                case 273:
                    return PredefMacros.above_macro(teXParser, strArr);
                case 274:
                    return PredefMacros.abovewithdelims_macro(teXParser, strArr);
                case 275:
                    return PredefMacros.st_macro(teXParser, strArr);
                case 276:
                    return PredefMacros.fcscore_macro(teXParser, strArr);
                case 277:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 278:
                    return PredefMacros.qquad_macro(teXParser, strArr);
                case 279:
                    return PredefMacros.longdiv_macro(teXParser, strArr);
                case 280:
                    return PredefMacros.questeq_macro(teXParser, strArr);
                case 281:
                    return PredefMacros.bangle_macro(teXParser, strArr);
                case 282:
                    return PredefMacros.brace_macro(teXParser, strArr);
                case 283:
                    return PredefMacros.brack_macro(teXParser, strArr);
                default:
                    return null;
            }
        } catch (Exception e6) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + e6.getMessage());
        }
    }

    @Override
    public Object invoke(TeXParser teXParser, String[] strArr) {
        return invokeID(this.f18029id, teXParser, strArr);
    }

    public PredefMacroInfo(int i10, int i11) {
        super(i11);
        this.f18029id = i10;
    }
}
